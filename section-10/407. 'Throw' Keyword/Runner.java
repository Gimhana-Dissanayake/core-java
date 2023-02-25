
// 'throw' keyword:
// In general, in java applications, developers will write programs to implement
// their application requirements, as part of implementing application
// requirements there may be a chance to get exceptions, the developers are not
// having any intention to raise the exception explicitly.

// In java applications, if we want to raise the exceptions intetionally there
// we will use 'throw' keyword.

// In java applications, 'throws' is a keyword, it can be used to raise an
// exception explicitly, here the exception may be predefined exception or user
// defined exception

// Syntax: throw new ExceptionName([ParamList])

class Student {

    String sid;
    String sname;
    int smarks;
    String saddr;

    public Student(String sid, String sname, int smarks, String saddr) {
        this.sid = sid;
        this.sname = sname;
        this.smarks = smarks;
        this.saddr = saddr;
    }

    public void getStudentStatus() {
        System.out.println("Student Details");
        System.out.println("---------------------");
        System.out.println("Student Id          : " + sid);
        System.out.println("Student Id          : " + sname);
        System.out.println("Student Id          : " + saddr);
        System.out.println("Student Id          : " + smarks);

        String status = "";

        if (smarks >= 0 && smarks < 30) {
            status = "Fail";
        } else if (smarks >= 30 && smarks < 30) {
            status = "Third Class";
        } else if (smarks >= 50 && smarks < 60) {
            status = "Second Class";
        } else if (smarks >= 60 && smarks < 70) {
            status = "First Class";
        } else if (smarks >= 70 && smarks <= 100) {
            status = "Distinction";
        } else {
            throw new RuntimeException("Invalid Marks, Marks must be in between 0 to 100");
        }

        System.out.println("Student status : " + status);

    }

}

public class Runner {
    public static void main(String[] args) {
        Student std1 = new Student("s-102", "Sam", 70, "Colombo");
        std1.getStudentStatus();
        Student std2 = new Student("s-103", "Jim", 120, "Kandy");
        std2.getStudentStatus();
    }
}