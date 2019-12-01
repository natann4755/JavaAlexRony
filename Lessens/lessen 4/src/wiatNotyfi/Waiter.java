package wiatNotyfi;

import java.time.Clock;

public class Waiter implements Runnable {

    Message m;

    public Waiter(Message m) {
        this.m = m;
    }


    @Override
    public void run() {
        synchronized (this.m){
            System.out.println(Thread.currentThread().getName()+" "+System.currentTimeMillis());
            System.out.println(Thread.currentThread().getName()+" "+System.currentTimeMillis());
            System.out.println(Thread.currentThread().getName()+" "+System.currentTimeMillis());
            System.out.println(Thread.currentThread().getName()+" "+System.currentTimeMillis());
            System.out.println(Thread.currentThread().getName()+" "+System.currentTimeMillis());
            try {
                this.m.wait();
            } catch (Exception e) {
                    e.printStackTrace();
            }
            System.out.println(m.getMessage());
            System.out.println(Thread.currentThread().getName()+" "+System.currentTimeMillis());

        }

    }
}
