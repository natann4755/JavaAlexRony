package ThreadColor;

public class Main {
    public static void main(String[] args) {
        PeintTred u = new PeintTred();
        Thrread t1 = new Thrread(u);
        Thrread t3 = new Thrread(u);
        Thread ttt = new Thread("uu");
        Thrread uuuu = new Thrread(u,"iii");
        t1.setName("theard 1");
        Thrread t2 = new Thrread(u);
        t2.setName("theard 2");
        t1.start();
        t2.start();


    }
}
