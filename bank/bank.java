package bank;

public class bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.name="hello"; // public access modifiers concepts
        account.email="hello@example.com"; // protected access modifiers concepts
        account.setpassword("abc"); // private access modifiers concepts
        System.out.println(account.getpassword());
    }
}

class Account{
    public String name;
    protected String email;
    private String password;

    //getter and setter methods for encapsulation

    public String getpassword()
    {
        return password;
    }
    public void setpassword(String pass)
    {
        this.password = pass;

    }
}
