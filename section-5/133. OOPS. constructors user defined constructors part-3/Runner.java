public class Runner {

    public static void main(String[] args) {
        Account acc = new Account("123", "first-acc", "savings", 5000);
        acc.getAccountDetails();
        Account acc1 = new Account("145", "second-acc", "current", 2000);
        acc1.getAccountDetails();
        Account acc2 = new Account("236", "third-acc", "savings", 10000);
        acc2.getAccountDetails();
    }

}

class Account {
    String accNo;
    String accName;
    String accType;
    int balance;

    public Account(String acc_No, String acc_Name, String acc_Type, int acc_Bal) {
        this.accNo = acc_No;
        this.accName = acc_Name;
        this.accType = acc_Type;
        this.balance = acc_Bal;
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