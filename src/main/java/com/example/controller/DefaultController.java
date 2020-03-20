package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {



    @GetMapping(value = "/")
    public String success() throws Exception {
      return "success";
    }

}
