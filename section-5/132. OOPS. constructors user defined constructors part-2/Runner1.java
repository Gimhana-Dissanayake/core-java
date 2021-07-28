public class Runner1 {

    public static void main(String[] args) {
        Account1 acc = new Account1();// new Account() is the default constructor we are calling here
        acc.getAccountDetails();
    }

}

class Account1 {
    String accNo;
    String accName;
    String accType;
    int balance;

    public Account1() {
        accNo = "abc123";
        accName = "Durga";
        accType = "Savings";
        balance = 500000;
    }

    public void getAccountDetails() {
        System.out.println("Account Details");
        System.out.println("---------------");
        System.out.println("Account Number      : " + accNo);
        System.out.println("Account Holder name : " + accName);
        System.out.println("Account Type        : " + accType);
        System.out.println("Account Balance     : " + balance);
    }

}