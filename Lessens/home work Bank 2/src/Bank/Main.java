package Bank;

public class Main {
    public static void main(String[] args) {
        counntBank bank =new counntBank("111");
        User a = new User("a",bank);
        User b = new User("b",bank);
        User c = new User("c",bank);

        a.TodepositAttraction(350,200.5);
        b.TodepositAttraction(459,1400);
        c.TodepositAttraction(499,1500.3);
    }
}
