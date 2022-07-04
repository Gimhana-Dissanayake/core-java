
class Course {

    private String cid;
    private String cname;
    private int ccost;

    public Course(String cid, String cname, int ccost) {
        this.cid = cid;
        this.cname = cname;
        this.ccost = ccost;
    }

    public String getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public int getCcost() {
        return ccost;
    }

}

class Student {

    private String sid;
    private String sname;
    private String saddr;
    private Course course;

    public Student(String sid, String sname, String saddr, Course course) {
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
        this.course = course;
    }

    public void getStudentDetails() {

    }

}

public class Runner {

    // It is a relation between entity classes, where multiple instances of an
    // entity should be mapped with multiple instances of another entity.

    // Ex: Mulitple students have joined with multiple courses.

}
