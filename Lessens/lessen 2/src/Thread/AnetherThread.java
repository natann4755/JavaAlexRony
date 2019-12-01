package Thread;

public class AnetherThread extends Thread {
    ThreadColor yy = new ThreadColor();

    @Override
    public void run() {
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("ppp");
            return;
        }
        System.out.println(ThreadColor.ANSI_PURPLE+"anether thread"+" "+Thread.currentThread().getName());
    }
}
