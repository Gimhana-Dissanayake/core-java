
class Branch {
    private String bid;
    private String bname;

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

}

class Student {
    private String sid;
    private String sname;
    private String saddr;
    private Branch branch;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddr() {
        return saddr;
    }

    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void getStudentDetails() {
        System.out.println("Student Details");
        System.out.println("------------------------");
        System.out.println("Student Id  : " + sid);
        System.out.println("Student Name  : " + sname);
        System.out.println("Student Address  : " + saddr);
        System.out.println("Branch Id  : " + branch.getBid());
        System.out.println("Branch Name  : " + branch.getBname());
    }

}

public class Runner {
    // Many-to-one Association:
    // It is a relationship between entity classes, where multiple instance of an
    // entity should be mapped with exactly single instance of another entity

    // Ex: Multiple students have joined with single Branch

    public static void main(String[] args) {
        Branch branch = new Branch();
        branch.setBid("B-111");
        branch.setBname("CS");

        Student std1 = new Student();
        std1.setSid("S-111");
        std1.setSname("AAA");
        std1.setSaddr("Hyd");
        std1.setBranch(branch);

        std1.getStudentDetails();
        System.out.println();

        Student std2 = new Student();
        std2.setSid("S-222");
        std2.setSname("BBB");
        std2.setSaddr("Hyd");
        std2.setBranch(branch);

        std2.getStudentDetails();
        System.out.println();

        Student std3 = new Student();
        std3.setSid("S-333");
        std3.setSname("CCC");
        std3.setSaddr("Hyd");
        std3.setBranch(branch);

        std3.getStudentDetails();
        System.out.println();
    }

}
