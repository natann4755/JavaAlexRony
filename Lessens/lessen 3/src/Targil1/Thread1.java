package Targil1;

public class Thread1 extends Thread {
    Tabl t;

    public Thread1(Tabl t) {
        this.t = t;
    }

    @Override
    public void run() {

        t.printTabl(100);
        for (int i = 0; i <5 ; i++) {
            System.out.println("theard 2 rannig");
        }

    }
}
