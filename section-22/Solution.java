import java.util.*;
import java.util.Arrays;

class Student {

  private int id;
  private String fname;
  private double cgpa;

  public Student(int id, String fname, double cgpa) {
    super();
    this.id = id;
    this.fname = fname;
    this.cgpa = cgpa;
  }

  public int getId() {
    return id;
  }

  public String getFname() {
    return fname;
  }

  public double getCgpa() {
    return cgpa;
  }
}

public class ObjectComparator implements Comparator {

  public int compare(Object obj1, Object obj2) {
    MyObject myObj1 = (MyObject) obj1;
    MyObject myObj2 = (MyObject) obj2;
    Integer stringResult = myObj1.cgpa().compareTo(myObj2.cgpa());
    if (stringResult == 0) {
      // Strings are equal, sort by date
      Integer re = myObj1.fname().compareTo(myObj2.fname());

      if (re == 0) {
        Integer res = myObj1.id().compareTo(myObj2.id());

        return res;
      } else {
        return re;
      }
    } else {
      return stringResult;
    }
  }
}

//Complete the code
public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());

    List<Student> studentList = new ArrayList<Student>();
    while (testCases > 0) {
      int id = in.nextInt();
      String fname = in.next();
      double cgpa = in.nextDouble();

      Student st = new Student(id, fname, cgpa);
      studentList.add(st);

      testCases--;
    }

    Collections.sort(studentList, new ObjectComparator());

    // Arrays.sort(studentList,(a,b) ->  )
    //    Arrays.sort(studentList, (a,b) -> a.fname );

    for (Student st : studentList) {
      System.out.println(st.getFname());
    }
  }
}
