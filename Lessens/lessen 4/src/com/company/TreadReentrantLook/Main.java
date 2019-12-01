package com.company.TreadReentrantLook;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static ReentrantLock rr = new ReentrantLock();
    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
       m1 mm = new m1(a);
       m2 mm2 = new m2(a);
//        m1 mm3 = new m1(a);
//        m2 mm4 = new m2(a);
        ExecutorService p = Executors.newFixedThreadPool(1);
        p.execute(mm);
        p.execute(mm2);
//        p.execute(mm3);
//        p.execute(mm4);

        p.shutdown();
//   Thread t1 = new Thread (new m1(a));
//   t1.setPriority(5);
//        Thread t2 = new Thread(new m2(a));
//        t1.start();
//        t2.start();
    }
}



      class m1 implements Runnable {
        ArrayList a1;

        public m1(ArrayList a1) {
            this.a1 = a1;
        }

        @Override
        public void run() {

          // Main.rr.lock();
           try {
               for (Object i :a1) {
                   System.out.println(i);
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }

               }
           }
           finally {
              // Main.rr.unlock();
           }


        }
    }


     class m2 implements Runnable{
        ArrayList a2;

        public m2(ArrayList a2) {
            this.a2 = a2;
        }

        @Override
        public void run() {
           // Main.rr.lock();
            try {
                for (int i = 0; i <a2.size() ; i++) {
                    System.out.println(a2.get(i));
                }
                a2.remove(a2.size()-1);
            }
           finally {
            //   Main.rr.unlock();
            }

        }
    }
