public class Runner {
    public static void main(String args[]) {
        // Q. what is the difference between Encapsulation and Abstraction?

        // The process of combining data and coding part as a single unit is called as
        // "Encapsulation".This is done through methods (ex- getters and setters)

        // The process of hiding unnecessary implementation and the process of showing
        // necessary implementation is called as "Abstraction".By using packages,
        // Abstract classes, Interfaces

        // In java applications, both abstraction and encapsulations improves security
        // ecapsulation+ abstraction = security
    }
}

class Employee {

    private String eid;
    private String ename;

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

}