package com.example.demo;

public class MyThread extends Thread{
    int j=20;
    public void run(){
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(this.getName()+",i="+j--);
        }
    }
}
