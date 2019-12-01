package Targil1;

import Messeg.Theard1;

public class Main {
    public static void main(String[] args) {
        Tabl t = new Tabl();
        Tabl t11 = new Tabl();

        Thread1 t1= new Thread1(t11);
        Thread2 t2= new Thread2(t);

        t1.start();
        t2.start();

    }
}
