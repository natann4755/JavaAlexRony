package DataBank;

public class User {
    private String UserName;
    private int Pasword;

    public User(String userName, int pasword) {
        setUserName(userName);
        setPasword(pasword);
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getPasword() {
        return Pasword;
    }

    public void setPasword(int pasword) {
        Pasword = pasword;
    }
}
