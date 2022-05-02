
class Account {
    String accNo;
    String accName;
    String accType;
    int balance;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}

class Employee {
    String eid;
    String ename;
    int esal;
    String eaddr;
    Account account;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEsal() {
        return esal;
    }

    public void setEsal(int esal) {
        this.esal = esal;
    }

    public String getEaddr() {
        return eaddr;
    }

    public void setEaddr(String eaddr) {
        this.eaddr = eaddr;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void getEmployeeDetails() {

        System.out.println("Employee Details");
        System.out.println("----------------");

        System.out.println("Employee Id     : " + getEid());
        System.out.println("Employee Name   : " + getEname());
        System.out.println("Employee Salary : " + getEsal());
        System.out.println("Employee Address: " + getEaddr());

        System.out.println();
        System.out.println("Account Details");
        System.out.println("----------------");
        System.out.println("Account Number  : " + account.getAccNo());
        System.out.println("Account Name    : " + account.getAccName());
        System.out.println("Account Type    : " + account.getAccType());
        System.out.println("Account Balance : " + account.getBalance());

    }

}

public class Runner {

    public static void main(String[] args) {

        Account account = new Account();

        account.setAccNo("abc123");
        account.setAccName("Jimmy");
        account.setAccType("Savings");
        account.setBalance(25000);

        Employee employee = new Employee();
        employee.setEid("E-111");
        employee.setEname("Durga");
        employee.setEsal(10000);
        employee.setEaddr("Colombo");
        employee.setAccount(account);

        employee.getEmployeeDetails();

    }

}
