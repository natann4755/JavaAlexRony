package Bank;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class counntBank {
    private String name;
    private double money = 5000;



    public counntBank(String name) {
        setName(name);

    }

    public synchronized void  attraction (double money){
        this.money-=money;
        System.out.println(Thread.currentThread().getName()+" "+this.money);


    }

    public synchronized void deposit (double money){
        this.money+=money;
        System.out.println(Thread.currentThread().getName()+" "+this.money);

    }

    public String getName() {
        return name;
    }
    public void printName() {
        System.out.println(name);
    }



    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }
}
