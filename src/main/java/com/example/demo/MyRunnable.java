package com.example.demo;

public class MyRunnable implements Runnable{

    static int j=10000;
    @Override
    public synchronized void  run() {
        try {

            for (int i = 0; i < 5000; i++) {
                Thread.sleep(100);
                System.out.println(j--);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
