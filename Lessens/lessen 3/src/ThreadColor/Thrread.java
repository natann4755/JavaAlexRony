package ThreadColor;

public class Thrread extends  Thread {
    PeintTred p;

    public Thrread(PeintTred p) {
        this.p = p;
    }
    public Thrread(PeintTred p,String s) {
        super(s);
        this.p = p;
    }


    @Override
    public void run() {
        p.print();
    }
}
