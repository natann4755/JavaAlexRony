package t1;

public class t1 extends Thread{


    public t1(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            Print(i,this.getName());
            try {
                sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static synchronized void Print (int i ,String s){
            System.out.print(i + ") ");
            for (int j = 0; j < 7; j++) {
                System.out.print(s);
            }
            System.out.println();

        System.out.println("this code is not synchronized");
            System.out.print(i+" )");
            for (int j = 0; j <7 ; j++) {
                System.out.print(j);

            }
            System.out.println();

    }

    public static void main(String[] args) {
        t1 tr1,tr2;

        tr1 = new t1("a");
        tr2 = new t1("b");
        tr1.start();
        tr2.start();
    }
    }

