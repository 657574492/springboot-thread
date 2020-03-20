package com.example.controller;

import com.example.service.CustomMultiThreadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/multithreading")
public class CustomMultiThreadingController {
    @Autowired
    private CustomMultiThreadingService customMultiThreadingService;

    @ResponseBody
    @RequestMapping(value="/dotask")
    public String doTask() {
        for (int i=0;i<10;i++){
            customMultiThreadingService.executeAysncTask1(i);
            customMultiThreadingService.executeAsyncTask2(i);
        }
        return "success";
    }

    @ResponseBody
    @RequestMapping(value="/dojob")
    public String doJob() {
        for (int i=0;i<10;i++){
            customMultiThreadingService.executeAysncTask1(i);
            customMultiThreadingService.executeAsyncTask2(i);
            customMultiThreadingService.executeAsyncTask3(i);
        }
        return "success";
    }
}
