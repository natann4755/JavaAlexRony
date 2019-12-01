package Thred1;

import com.company.Main;

public class AnatherThread extends Thread {
private Thread t1;

    @Override
    public void run() {


//        if (t1==null) {
//            try {
//
//                        sleep(49);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        System.out.println(Thread.currentThread().getName() + " " + "started");


        if (t1 != null) {
            try {
                t1.join();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(Thread.currentThread().getName() + " " + "Finished");
    }
    public void setT1(Thread t1) {
        this.t1 = t1;
    }
}
