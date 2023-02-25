class InsufficientFundsException extends Exception {

  public InsufficientFundsException(String exceptionDescription) {
    super(exceptionDescription);
  }
}

class Account {

  String accNo;
  String accHolderName;
  String accType;
  int balance;

  public Account(
    String accNo,
    String accHolderName,
    String accType,
    int balance
  ) {
    this.accNo = accNo;
    this.accHolderName = accHolderName;
    this.accType = accType;
    this.balance = balance;
  }
}

class Transation {

  String transactionId;

  public Transation(String transactionId) {
    this.transactionId = transactionId;
  }

  public void withdraw(Account account, int wdAmt) {
    try {
      System.out.println("Transation details");
      System.out.println("---------------------------");
      System.out.println("Transation id            : " + transactionId);
      System.out.println("Account Number            : " + account.accNo);
      System.out.println(
        "Account Holder Name       : " + account.accHolderName
      );
      System.out.println("Account Type              : " + account.accType);
      System.out.println("Transation Type          : " + "WITHDRAW");
      System.out.println("Withdraw Account          : " + wdAmt);

      if (wdAmt <= account.balance) {
        account.balance = account.balance - wdAmt;
        System.out.println("Total Balance     : " + account.balance);
        System.out.println("Trasaction Status : " + "SUCCESS");
      } else {
        System.out.println("Total Balance     : " + account.balance);
        System.out.println("Trasaction Status : " + "FAILURE");
        throw new InsufficientFundsException(
          "Reason: Funds are not sufficient in account"
        );
      }
    } catch (InsufficientFundsException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("********Thank you, Come Again********");
    }
  }
}

public class Runner {

  public static void main(String[] args) {
    Account acc1 = new Account("acc-00001", "Jimmy", "Saving", 20000);
    Transation tx1 = new Transation("tran-00001");
    tx1.withdraw(acc1, 5000);
    System.out.println();

    Account acc2 = new Account("acc-00002", "Sam", "Saving", 10000);
    Transation tx2 = new Transation("tran-00002");
    tx2.withdraw(acc2, 20000);
    System.out.println();
  }
}
//From video 436 - 438 the code is in this file
