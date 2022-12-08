
class Student implements Cloneable {
    String sid;
    String sname;
    String saddress;
    String semail;
    String smobile;

    public Student(String sid, String sname, String saddress, String semail, String smobile) {
        this.sid = sid;
        this.sname = sname;
        this.saddress = saddress;
        this.semail = semail;
        this.smobile = smobile;
    }

    public void getStudentDetails() {
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Student Id                   : " + this.sid);
        System.out.println("Student Name                 : " + this.sname);
        System.out.println("Student Address              : " + this.saddress);
        System.out.println("Student Email Id             : " + this.semail);
        System.out.println("Student Mobile No            : " + this.smobile);

    }

    public Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }

}

public class Runner {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student oriStudent = new Student("s-111", "Kumara", "Colombo", "kumara@gmail.com", "0714567852");
        System.out.println("original student ref value " + oriStudent);
        System.out.println("Student Original Data");
        oriStudent.getStudentDetails();

        System.out.println("-----------------------------------------------------------");

        Object obj = oriStudent.clone();
        Student duplicatStudent = (Student) obj;
        System.out.println("duplicate student ref value " + duplicatStudent);
        System.out.println("Student Duplicated Data");
        duplicatStudent.getStudentDetails();
    }

}
