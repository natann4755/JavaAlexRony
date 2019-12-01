package Messeg;

public class Message {
    private  String message;
    private boolean empty= true;

    public synchronized String read(){
        while (empty){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("read");

        }
        empty=true;
        this.notify();
        return message;

    }

    public synchronized void write (String message){
        while (!empty){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("write");
        empty=false;
        this.message=message;
        this.notify();

    }

    public String getMessage() {
        return message;
    }
}
