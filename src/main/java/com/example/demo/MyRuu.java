package com.example.demo;

public class MyRuu extends Thread{
    public MyRuu(String name) {
        super(name);
    }
    public void run() {
        System.out.println(Thread.currentThread().getName());
        //while(true);
    }

}
