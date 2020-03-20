package com.example.demo;

public class MyRun extends Thread{
    Object obj;
    public MyRun(String name,Object obj) {
        // TODO Auto-generated constructor stub
        super(name);
        this.obj = obj;
    }
    public void run(){

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ " i="+i);
            if(i%2 == 0)
                Thread.yield();
        }

    }

}
