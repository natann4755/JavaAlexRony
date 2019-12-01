package Thread;

public class Tread3 extends ThreadColor implements Runnable {

    @Override
    public void run() {

        System.out.println(this.ANSI_RESET+"I an implemens Rennable"+" "+Thread.currentThread().getName());
    }
}
