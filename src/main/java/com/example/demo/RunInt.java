package com.example.demo;

public class RunInt extends Thread{

    public void run() {
        while(!this.isInterrupted()){
            synchronized (this) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+" i="+i);
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    System.out.println(Thread.currentThread().getName()+" interrupted!");
                    break;
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+" dead");
    }


}
