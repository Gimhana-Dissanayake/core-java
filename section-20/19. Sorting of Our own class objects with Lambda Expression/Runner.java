import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {

  int eno;
  String ename;

  public Employee(int eno, String ename) {
    this.eno = eno;
    this.ename = ename;
  }

  @Override
  public String toString() {
    return eno + " : " + ename;
  }
}

public class Runner {

  public static void main(String[] args) {
    ArrayList<Employee> l = new ArrayList<Employee>();
    Employee e1 = new Employee(30, "Aravinda");
    Employee e2 = new Employee(129, "Kumar");
    Employee e3 = new Employee(500, "Palitha");
    Employee e4 = new Employee(10, "Raju");
    Employee e5 = new Employee(30, "Sanath");
    Employee e6 = new Employee(99, "Jagath");
    Employee e7 = new Employee(80, "Sunil");

    l.add(e1);
    l.add(e2);
    l.add(e3);
    l.add(e4);
    l.add(e5);
    l.add(e6);
    l.add(e7);

    System.out.println("before sorting");
    System.out.println(l);

    Comparator<Employee> c = (emp1, emp2) ->
      emp1.eno > emp2.eno ? -1 : emp1.eno < emp2.eno ? +1 : 0;
    Collections.sort(l, c);

    System.out.println("after sorting");
    System.out.println(l);
  }
}
