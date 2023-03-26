import java.util.Comparator;
import java.util.TreeSet;

class Student {

  String sid;
  String sname;
  String saddr;

  public Student(String sid, String sname, String saddr) {
    this.sid = sid;
    this.sname = sname;
    this.saddr = saddr;
  }

  @Override
  public String toString() {
    return (
      "Student [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + "]\n"
    );
  }
}

class MyComparator implements Comparator<Student> {

  @Override
  public int compare(Student std1, Student std2) {
    return std1.sid.compareTo(std2.sid);
  }
}

public class Runner {

  public static void main(String[] args) {
    Student s1 = new Student("S-111", "Nag", "Hyd");
    Student s2 = new Student("S-222", "Baba", "Chennai");
    Student s3 = new Student("S-333", "Ram", "Pune");
    Student s4 = new Student("S-444", "Charan", "Delhi");
    Student s5 = new Student("S-555", "Chaitu", "Mumbai");

    System.out.println(
      "***** Comparable interface without anonymous inner classes *****"
    );

    MyComparator myComp = new MyComparator();

    TreeSet<Student> ts = new TreeSet<Student>(myComp);

    ts.add(s4);
    ts.add(s1);
    ts.add(s5);
    ts.add(s3);
    ts.add(s2);

    System.out.println(ts);

    System.out.println(
      "***** Comparable interface with anonymous inner classes *****"
    );

    Comparator c = new Comparator<Student>() {
      @Override
      public int compare(Student std1, Student std2) {
        return -std1.sid.compareTo(std2.sid); //decending order
      }
    };

    TreeSet<Student> ts1 = new TreeSet<Student>(c);

    ts1.add(s4);
    ts1.add(s1);
    ts1.add(s5);
    ts1.add(s3);
    ts1.add(s2);

    System.out.println(ts1);

    System.out.println(
      "***** Comparable interface with lamba expressions *****"
    );

    Comparator<Student> lambdaComparator = (std1, std2) -> {
      return -std1.sid.compareTo(std2.sid); //decending order
    };

    TreeSet<Student> ts2 = new TreeSet<Student>(lambdaComparator);

    ts2.add(s4);
    ts2.add(s1);
    ts2.add(s5);
    ts2.add(s3);
    ts2.add(s2);

    System.out.println(ts2);
  }
}
