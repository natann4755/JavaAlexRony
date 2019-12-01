package Thread;

public class Main {
    public static void main(String[] args) {
        ThreadColor tt = new ThreadColor();
        System.out.println(tt.ANSI_BLUE+"the main thread"+" "+Thread.currentThread().getName());

        Thread anetherThread = new AnetherThread();
        anetherThread.start();
        anetherThread.interrupt();

        new Thread(){
            @Override
            public void run() {
                try {
                    sleep(6);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(tt.ANSI_GREEN+"I an the anonimus class"+" "+Thread.currentThread().getName());
            }
        }.start();
        Tread3 rr = new Tread3();
        Thread yyy =new Thread(rr);

        yyy.start();
        rr.run();

        System.out.println(tt.ANSI_BLUE+"the main thread"+" "+Thread.currentThread().getName());
    }
}
