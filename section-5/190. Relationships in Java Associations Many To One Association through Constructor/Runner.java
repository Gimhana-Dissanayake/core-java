
class Branch {
    private String bid;
    private String bname;

    public Branch(String bid, String bname) {
        this.bid = bid;
        this.bname = bname;
    }

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

    public Student(String sid, String sname, String saddr, Branch branch) {
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
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
        Branch branch = new Branch("B-111", "CS");

        Student std1 = new Student("S-111", "AAA", "Hyd", branch);
        std1.getStudentDetails();
        System.out.println();

        Student std2 = new Student("S-222", "BBB", "Hyd", branch);
        std2.getStudentDetails();
        System.out.println();

        Student std3 = new Student("S-333", "CCC", "Hyd", branch);
        std3.getStudentDetails();
        System.out.println();
    }

}
