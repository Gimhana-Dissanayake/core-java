/*

    It is a relation between entity classes, where one instance of an entity should be mapped with exactly one instance of another entity.
    EX: Every Employee should have exactly one Account.

    In Associations, we are able to perform Dependancy Injection inorder to achieve Associations.

    1. Constructor Dependancy Injection
    2. Setter Method Dependancy Injection


    1. Constructor Dependancy Injection;
    We will injection dependent objects through a constructor.

    2. Setter Method Dependency Injection
    We will inject dependent objects through setter methods.

*/

class Account {
    String accNo;
    String accName;
    String accType;
    int balance;

    public Account(String accNo, String accName, String accType, int balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.accType = accType;
        this.balance = balance;
    }

}

class Employee {
    String eid;
    String ename;
    String esal;
    String eaddr;
    Account account;

    public Employee(String eid, String ename, String esal, String eaddr, Account account) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
        this.account = account;
    }

    public void getEmployeeDetails() {

        System.out.println("Employee Details");
        System.out.println("----------------");

        System.out.println("Employee Id        :" + eid);
        System.out.println("Employee Name   :" + ename);
        System.out.println("Employee Salary   :" + esal);
        System.out.println("Employee Address   :" + eaddr);

        System.out.println();
        System.out.println("Account Details");
        System.out.println("----------------");
        System.out.println("Account Number    : " + account.accNo);
        System.out.println("Account Name    : " + account.accName);
        System.out.println("Account Type    : " + account.accType);
        System.out.println("Account Balance    : " + account.balance);

    }

}

public class Runner {

    public static void main(String[] args) {
        Account acc = new Account("abc123", "Durga", "Savings", 25000);
        Employee emp = new Employee("E-111", "Durga", "1000", "Hydrabath", acc);

        emp.getEmployeeDetails();
    }

}
