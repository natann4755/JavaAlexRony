package Messeg;

import java.util.Random;

public class ThreadRead implements Runnable {

    private Message m;
//    private String s;

    public ThreadRead(Message m) {
        this.m = m;
    }

    @Override
    public void run() {
        //Random rr = new Random();
        for(String ddd = m.read();!ddd.equals("finish");ddd=m.read()){
            System.out.println(ddd);
//            try {
//                Thread.sleep(rr.nextInt(200));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        }


    }

