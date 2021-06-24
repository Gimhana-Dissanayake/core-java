public class Runner {

    // containers in JAVA

    // containers is a java fundamental element, it is able to manage java elements
    // like variables, methods, constructors, block....

    // There are three types of containers in Java.
    // 1. Class
    // 2. Abstract Class
    // 3. Interface

    // Class:
    // In java applications, to represent entities we have to use classes.
    // EX: Student, Employee, Customer, Account, product,.....

    // Entities -----> Classes
    // Entities Data -----> Variables
    // Entities Behaviours -----> Methods

    // To prepare classes in Java applications, we will use the fallowing syntax.

    // [access modifiers] class ClassName [extends SuperClassName][implements
    // InterfaceList]{
    // ---variables----
    // ---methods----
    // ----constructors----
    // ----blocks------
    // ---- Enums----
    // ----classes-----
    // ----abstract cSlasses----
    // -----interfaces----
    // }

    // IMPORTANT - if both extends and implements keywords are used, then first
    // comes extends and after that comes implements

    // In JAVA any container(class/abstract class/interface) can hold any other
    // container.

    public static void main(String args[]) {

    }

}

class Transaction {
    String tid;
    String accNo;
    String accName;
    String accType;

    public void deposit(String accNo, int depAmt) {

    }

    public void withdraw(String accNo, int wdAmt) {

    }

    public void transferFunds(String sourceAccount, String targetAccount, int transferAmount) {

    }
}