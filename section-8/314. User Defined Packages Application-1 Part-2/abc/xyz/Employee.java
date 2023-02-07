

public class Employee {
    int eno;
    String ename;
    float esal;
    String eaddr;
    public Employee(int eno, String ename, float esal, String eaddr) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
    }

    public void getEmpDetails(){
        System.out.println("Employee Details");
        System.out.println("---------------------------");
        System.out.println("Employee number  : "+eno);
        System.out.println("Employee name    : "+ename);
        System.out.println("Employee salary  : "+esal);
        System.out.println("Employee address : "+eaddr);
    }
    
}

// Watch the lecture