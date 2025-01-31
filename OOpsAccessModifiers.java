package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // getters and setters
    public String getpassword() {
        return this.password;
    }

    public void String

    setpassword(String pass) {
        this.password = pass;

    }
}

public class OOpsAccessModifiers {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "apna collage"; // acces by all because public thing
        account1.email = "mdshujaullah789@gmail.com"; // only access by sub class of another class
        account1.setpassword("abcd");
        System.out.println(account1.getpassword());
    }
}
