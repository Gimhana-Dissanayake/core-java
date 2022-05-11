
class Employee {

    private String eid;
    private String ename;
    private int esal;
    private String eaddr;

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

}

class Department {

    private String did;
    private String dname;
    private Employee[] emps;

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Employee[] getEmps() {
        return emps;
    }

    public void setEmps(Employee[] emps) {
        this.emps = emps;
    }

    public void getDepartmentDetails() {
        System.out.println("Department Details");
        System.out.println("----------------------");
        System.out.println("Department Id : " + did);
        System.out.println("Department Name: " + dname);
        System.out.println("EID\tENAME\tESAL\tEADDR");
        System.out.println("----------------------");
        for (Employee emp : emps) {
            System.out.println(emp.getEid() + "\t");
            System.out.println(emp.getEname() + "\t");
            System.out.println(emp.getEsal() + "\t");
            System.out.println(emp.getEaddr() + "\n");
        }
    }

}

public class Runner {

    // 2.One-to-many association:
    // It is a relationship between entities, where one instance of an entity should
    // be mapped with multiple instance of another entity.

    // EX: Single Department has multiple Employees.

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setEid("E-111");
        e1.setEname("AAA");
        e1.setEsal(5000);
        e1.setEaddr("Hyd");

        Employee e2 = new Employee();
        e2.setEid("E-222");
        e2.setEname("BBB");
        e2.setEsal(6000);
        e2.setEaddr("Hyd");

        Employee e3 = new Employee();
        e3.setEid("E-333");
        e3.setEname("CCC");
        e3.setEsal(7000);
        e3.setEaddr("Hyd");

        Employee e4 = new Employee();
        e4.setEid("E-444");
        e4.setEname("DDD");
        e4.setEsal(8000);
        e4.setEaddr("Hyd");

        Employee[] emps = { e1, e2, e3, e4 };

        Department dept = new Department();
        dept.setDid("D-111");
        dept.setDname("Admin");
        dept.setEmps(emps);

        dept.getDepartmentDetails();

    }

}
