package com.example.demo;

public class MyThreadd extends Thread{

    public MyThreadd(String name) {
        // TODO Auto-generated constructor stub
        super(name);
    }
    public void run(){
        synchronized (this) {
            System.out.println(Thread.currentThread().getName()+" notify a thread");
            notify();
        }
        while(true);
    }

}
