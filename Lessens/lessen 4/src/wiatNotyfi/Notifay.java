package wiatNotyfi;

import java.time.Clock;
import java.util.Date;

public class Notifay implements Runnable {
    Message m;

    public Notifay(Message m) {
        this.m = m;
    }


    @Override
    public void run() {
        System.out.println("notyfy run333");
        try {
            Thread.sleep(2001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this.m){
            m.setMessage("notify run");
            this.m.notifyAll();
        }


    }
}
