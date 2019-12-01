package ThreadColor;

public class PeintTred {
    private int i =0;
    public  void print (){
        String c;
        switch (Thread.currentThread().getName()){
            case "theard 1":
                c=Color.ANSI_BLUE;
            break;
            case "theard 2":
                c=Color.ANSI_GREEN;
                break;
                default:
                    c=Color.ANSI_RED;
        }

                    for ( i = 0; i < 10; i++) {
                        System.out.println(c + " " + Thread.currentThread().getName() + " i: " + i);
                    }
                }
    }

