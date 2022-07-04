class Course {

    private String cid;
    private String cname;
    private int ccost;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCcost() {
        return ccost;
    }

    public void setCcost(int ccost) {
        this.ccost = ccost;
    }

}

class Student {

    private String sid;
    private String sname;
    private String saddr;
    private Course[] courses;

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

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void getStudentDetails() {

        System.out.println("Student Details");
        System.out.println("------------------------");
        System.out.println("Student Id         : " + sid);
        System.out.println("Student Name        : " + sname);
        System.out.println("Student Address         : " + saddr);
        System.out.println("CID\tCName\tCCOST        : " + sid);
        System.out.println("----------------------------------");

        for (Course course : courses) {
            System.out.println(course.getCid() + "\t");
            System.out.println(course.getCname() + "\t");
            System.out.println(course.getCcost() + "\n");

        }
    }

}

public class Runner {

    public static void main(String[] args) {

        Course c1 = new Course();
        c1.setCid("C-111");
        c1.setCname("Java");
        c1.setCcost(4000);

        Course c2 = new Course();
        c2.setCid("C-222");
        c2.setCname("Python");
        c2.setCcost(1000);

        Course[] courses = { c1, c2 };

        Student s1 = new Student();
        s1.setSid("S-111");
        s1.setSname("S-AAA");
        s1.setSaddr("Hyd");
        s1.setCourses(courses);

        Student s2 = new Student();
        s2.setSid("S-222");
        s2.setSname("S-BBB");
        s2.setSaddr("Hyd");
        s2.setCourses(courses);

        s1.getStudentDetails();
        System.out.println();
        s2.getStudentDetails();
        System.out.println();

    }

}
