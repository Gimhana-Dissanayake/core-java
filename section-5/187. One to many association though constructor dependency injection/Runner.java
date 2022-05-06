
// One-to-Many association: 
//------------------------------------------

//It is a relationship between entities, where one instance of an entity should be mapped with multiple instance of another entity.
//Ex: Single department has mulitple employees

class Employee {

    String eid;
    String ename;
    float esal;
    String eaddr;

    public Employee(String eid, String ename, float esal, String eaddr) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
    }

    // public void getEmployeeDetails() {
    // System.out.println("Employee Details ");
    // System.out.println("----------------------------");
    // System.out.println("Employee Id :" + eid);
    // System.out.println("Employee Name : " + ename);
    // System.out.println("Employee Salary : " + esal);
    // System.out.println("Employee Address : " + eaddr);
    // }

}

class Department {
    String did;
    String dname;
    Employee[] emps;

    public Department(String did, String dname, Employee[] emps) {
        this.did = did;
        this.dname = dname;
        this.emps = emps;
    }

    public void getDepartmentDetails() {
        System.out.println("Department Details");
        System.out.println("-------------------------");
        System.out.println("Department Id : " + did);
        System.out.println("Department Name : " + dname);
        System.out.println("EID\tEName\tESAL\tEADDR");
        System.out.println("-----------------------------------------------");

        for (Employee emp : emps) {
            System.out.println(emp.eid + "\t" + emp.ename + "\t" + emp.esal);
        }

    }

}

public class Runner {

    public static void main(String[] args) {
        Employee e1 = new Employee("E-111", "AAA", 5000, "Hyd");
        Employee e2 = new Employee("E-222", "BBB", 6000, "Hyd");
        Employee e3 = new Employee("E-333", "CCC", 7000, "Hyd");
        Employee e4 = new Employee("E-444", "DDD", 8000, "Hyd");

        Employee[] emps = { e1, e2, e3, e4 };

        Department dept = new Department("D-111", "Admin", emps);

        dept.getDepartmentDetails();

    }

}
