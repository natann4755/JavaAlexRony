package Messeg;

public class Main {
    public static void main(String[] args) {
        Message mm =new Message();


        Thread t1 = new Thread( new Theard1(mm));
        Thread t2 = new Thread(new ThreadRead(mm));

        t1.start();
        t2.start();

    }
}
