package Cars;

import java.util.Random;

public class Car extends uto {

    private int dors;
    private int engine;
    private long id;

    public Car(int rods, String model, String color, int dors, int engine) {
        super(rods, model, color);
        this.dors = dors;
        this.engine = engine;
        this.id = ssetId();
    }

    public int getDors() {
        return dors;
    }

    public void setDors(int dors) {
        this.dors = dors;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public long getId() {
        return id;
    }

    public long ssetId() {
        Random r =new Random(999);
        int nn = r.nextInt(1000000000)+1;
        long hh = 10000000000l-nn;
        System.out.println(nn);
        System.out.println(hh);
        return hh;
    }
    public String setId() {
        Random r =new Random(999);
        String bb ="";
        for (int i = 0; i <10 ; i++) {
            int nn = r.nextInt(10);
            bb+=nn;
        }

        System.out.println(bb);
        return bb;
    }
}
