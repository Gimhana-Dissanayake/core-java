import java.util.Comparator;
import java.util.TreeSet;

//  Q. Is it possible to use Comparator for Sorting User defined elements
// Ans: Yes, it is possible to sort user defined elements by using COmparator.

class Student {

  String sid;
  String sname;
  int marks;
  String saddr;

  public Student(String sid, String sname, int marks, String saddr) {
    this.sid = sid;
    this.sname = sname;
    this.marks = marks;
    this.saddr = saddr;
  }

  @Override
  public String toString() {
    return (
      "Student [sid=" +
      sid +
      ", sname=" +
      sname +
      ", marks=" +
      marks +
      ", saddr=" +
      saddr +
      "]\n"
    );
  }
}

class StudentComparator implements Comparator<Student> {

  @Override
  public int compare(Student std1, Student std2) {
    // int val = std1.sid.compareTo(std2.sid);
    // int val = std1.sname.compareTo(std2.sname);
    int val = std1.marks - std2.marks;

    return val;
  }
}

public class Runner {

  public static void main(String[] args) {
    Student s1 = new Student("001", "Durga", 70, "Hydrabad");
    Student s2 = new Student("002", "Nag", 88, "Chennai");
    Student s3 = new Student("003", "Anil", 67, "Delhi");
    Student s4 = new Student("004", "Rakesh", 92, "Mumbai");
    Student s5 = new Student("005", "Phani", 72, "Pune");

    StudentComparator studentComparator = new StudentComparator();

    TreeSet<Student> ts = new TreeSet<Student>(studentComparator);

    ts.add(s1);

    ts.add(s2);
    //mc.compare(std2, std1); +ve

    ts.add(s3);
    //mc.compare(std3, std1); -ve

    ts.add(s4);
    // mc.compare(std4, std1); +ve
    // mc.compare(std4, std2); +ve

    ts.add(s5);
    // mc.compare(std5, std1); +ve
    // mc.compare(std5, std2); -ve

    System.out.println(ts);
  }
}
