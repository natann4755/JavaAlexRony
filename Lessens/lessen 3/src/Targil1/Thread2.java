package Targil1;

public class Thread2 extends Thread{
    Tabl t;

    public Thread2(Tabl t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTablrr(5);
    }
}
