package Bank;

public class User implements Runnable{
    private String name;
    private counntBank bank;
    private double MoneyTodeposit;
    private double MoneyToAttraction;


    public User(String name, counntBank bank) {
        setName(name);
        setBank(bank);
    }
    public void TodepositAttraction(double Todeposit, double Attraction){
        Thread thread = new Thread(this);
        MoneyTodeposit=Todeposit;
        MoneyToAttraction = Attraction;
        thread.start();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public counntBank getBank() {
        return bank;
    }

    public void setBank(counntBank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        System.out.println(name +" "+ Thread.currentThread().getName());
        bank.deposit(MoneyTodeposit);
        bank.attraction(MoneyToAttraction);




    }
}
