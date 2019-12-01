package Messeg;

import java.util.Random;
import java.util.Scanner;

public class Theard1  implements Runnable{
    private Message m;



    public Theard1(Message m) {
        this.m = m;
    }

    @Override
    public void run() {
        String [] s = {
                "natan","1988","man","31"
        };
        Random r = new Random();
        for (int i = 0; i <s.length ; i++) {
          m.write(s[i]);
            try {
                Thread.sleep(r.nextInt(200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        m.write("finish");
    }
}
