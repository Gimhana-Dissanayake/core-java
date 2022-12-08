
class Account {
    String accNo;
    String accHolderName;
    String accType;
    int balance;

    public Account(String accNo, String accHolderName, String accType, int balance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accType = accType;
        this.balance = balance;
    }

}

class Employee implements Cloneable {
    String eid;
    String ename;
    float esal;
    String eaddr;

    Account account;

    public Employee(String eid, String ename, float esal, String eaddr, Account account) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
        this.account = account;
    }

    public void getEmpDetails() {
        System.out.println("Employee Details");
        System.out.println("------------------------------------");
        System.out.println("Employee Id      : " + eid);
        System.out.println("Employee Name    : " + ename);
        System.out.println("Employee Salary  : " + esal);
        System.out.println("Employee Address : " + eaddr);
        System.out.println();
        System.out.println("Accout Details");
        System.out.println("------------------------------------");
        System.out.println("Account Number      : " + account.accNo);
        System.out.println("Account Holder Name : " + account.accHolderName);
    }

    public Object clone() throws CloneNotSupportedException {

        Account duplicateAccount = new Account(account.accNo, account.accHolderName, account.accType, account.balance);

        Employee duplicateEmployee = new Employee(eid, ename, esal, eaddr, duplicateAccount);

        return duplicateEmployee;

    }

}

public class Runner {

    public static void main(String[] args) throws Exception {
        Account originalAcc = new Account("abc123", "Gimhana", "Savings", 15000);
        Employee originaEmployee = new Employee("E-111", "Gimhana", 5000, "Colombo", originalAcc);

        System.out.println("original emp data");
        originaEmployee.getEmpDetails();
        System.out.println("");
        Employee duplicateEmployee = (Employee) originaEmployee.clone();

        System.out.println("duplicate emp data");
        duplicateEmployee.getEmpDetails();

        System.out.print("*****************");

        System.out.println("Original Emp Obj Ref : " + originaEmployee);// different object
        System.out.println("Duplicate Emp Obj Ref : " + duplicateEmployee);// different object
        System.out.println("Original Acc Obj Ref : " + originaEmployee.account);// different object because of deep
                                                                                // cloning
        System.out.println("Duplicate Acc Obj Ref : " + duplicateEmployee.account);// different object because of deep
                                                                                   // cloning
    }

}
