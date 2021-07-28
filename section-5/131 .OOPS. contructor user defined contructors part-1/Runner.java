public class Runner {

    // User defined contructors:

    // These constructors are provided by the developers as per their application
    // requirements.

    // There are two types of user defined constructors
    // 1. 0-arg contructor
    // 2. Parameterized contructors

    // 1. 0-arg constructor:
    // If we provide any constructor explicitly without providing parameters then
    // that contructor is called as 0-arg constructor.

    // 2. Parameterized constructor:
    // If we provide any constructor explicitly with atleast one parameter then that
    // contructor is called as paramerized constructor.

    public static void main(String[] args) {
        Account acc = new Account();// new Account() is the default constructor we are calling here
        acc.setAccountDetails();
        acc.getAccountDetails();
    }

}

class Account {
    String accNo;
    String accName;
    String accType;
    int balance;

    public void setAccountDetails() {
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