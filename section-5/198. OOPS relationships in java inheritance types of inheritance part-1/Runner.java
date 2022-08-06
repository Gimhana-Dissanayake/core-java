//Types of inheritances:

//1. Single Inheritance
//2. Multiple Inheritance

//By combining above two inheritances fallowing inheritances can be derived
//3. Multi Level Inheritance
//4. Hierarchical Inheritance
//5. Hybrid Inheritance

//SINGLE INHERITANCE

class Employee {
    int eno;
    String ename;
    float esal;
    String eaddr;

    public void getEmpDetails() {
        System.out.println("Employee Number : " + eno);
        System.out.println("Employee Name : " + ename);
        System.out.println("Employee Salary : " + esal);
        System.out.println("Employee Address : " + eaddr);
    }
}

class Manager extends Employee {
    public Manager(int empNo, String empName, float empSal, String empAddr) {
        eno = empNo;
        ename = empName;
        esal = empSal;
        eaddr = empAddr;
    }

    public void getmanagerDetails() {
        System.out.println("Manager Details");
        System.out.println("--------------------");
        getEmpDetails();
    }
}

class Account extends Employee {
    public Account(int empNo, String empName, float empSal, String empAddr) {
        eno = empNo;
        ename = empName;
        esal = empSal;
        eaddr = empAddr;
    }

    public void getAccountDetails() {
        System.out.println("Accountant Details");
        System.out.println("--------------------");
        getEmpDetails();
    }
}

public class Runner {

    public static void main(String[] args) {
        Manager mgr = new Manager(111, "AAA", 50000, "Hyd");
        mgr.getmanagerDetails();
        System.out.println();
        Account acc = new Account(222, "BBB", 25000, "Hyd");
        acc.getAccountDetails();
    }

}
