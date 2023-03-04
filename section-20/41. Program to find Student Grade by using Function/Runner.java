import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {

  String name;
  int marks;

  Student(String name, int marks) {
    this.name = name;
    this.marks = marks;
  }
}

public class Runner {

  public static void main(String[] args) {
    ArrayList<Student> al = new ArrayList<Student>();
    populate(al);

    Function<Student, String> f = s -> {
      int marks = s.marks;
      if (marks >= 80) {
        return "A";
      } else if (marks >= 60) {
        return "B";
      }
      if (marks >= 50) {
        return "C";
      }
      if (marks >= 35) {
        return "D";
      } else {
        return "E";
      }
    };

    for (Student s : al) {
      System.out.println(
        "Name " + s.name + " | marks : " + s.marks + " | grade : " + f.apply(s)
      );
    }

    Predicate<Student> p = s -> s.marks >= 60;

    System.out.println(
      "******************USING BOTH PREDICATE AND FUNCTION***********************"
    );

    for (Student s : al) {
      if (p.test(s)) {
        System.out.println(
          "Name " +
          s.name +
          " | marks : " +
          s.marks +
          " | grade : " +
          f.apply(s)
        );
      }
    }
  }

  public static void populate(ArrayList<Student> l) {
    l.add(new Student("Malan", 100));
    l.add(new Student("Aravinda", 65));
    l.add(new Student("Kumara", 55));
    l.add(new Student("Saman", 45));
    l.add(new Student("Dulan", 25));
  }
}
