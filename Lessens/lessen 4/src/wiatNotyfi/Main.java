package wiatNotyfi;

public class Main {
    public static void main(String[] args) {
        Message m = new Message("hallow");

        Thread t1 = new Thread(new Waiter(m), "1");
        Thread t2 = new Thread(new Waiter(m),"2");

        Thread t3 = new Thread(new Notifay(m),"3");

        t1.start();
        t2.start();
        t3.start();
    }
}
