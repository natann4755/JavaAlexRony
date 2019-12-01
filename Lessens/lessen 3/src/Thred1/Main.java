package Thred1;

public class Main {
    public static void main(String[] args) {
        AnatherThread a = new AnatherThread();
        AnatherThread b = new AnatherThread();

        a.setT1(b);
        a.start();
        b.start();
        System.out.println(Thread.currentThread().getName());


    }
}
