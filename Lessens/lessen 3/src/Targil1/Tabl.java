package Targil1;

public class Tabl {

    public synchronized void printTabl(int n){
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i*n);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void printTablrr (int n){
        for (int i = 5; i >0 ; i--) {
            System.out.println(i*n);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
