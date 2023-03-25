import java.util.*;
import java.util.TreeSet;

// watch the lecture
// Q)Is it possible to sort user defined elements through TreeSet?

// Ans)
// Yes, it is possible to sort user defined elements through TreeSet, but, we have to use the following steps

// 1. Declare an User defined
// 2. Implement java.lang.Comparable interface.
// 3. In User defined class provide implementation to compareTo() method
// 4. In main class and main() method create Objects for User defined class and add these objects to TreeSet.

class Employee implements Comparable<Employee> {

  private int eno;
  private String ename;
  private float esal;
  private String eaddr;

  public Employee(int eno, String ename, float esal, String eaddr) {
    this.eno = eno;
    this.ename = ename;
    this.esal = esal;
    this.eaddr = eaddr;
  }

  @Override
  public int compareTo(Employee emp) {
    int val = 0;

    try {
      val = this.ename.compareTo(emp.ename);
      //   To get the elements based on esal use the following code
      //   val = new Float(this.esal).compareTo(emp.esal);
      //   To get the elements based on address use the following code
      //   val = new Float(this.eaddr).compareTo(emp.eaddr);
    } catch (Exception e) {
      e.printStackTrace();
    }

    // changing the val variable value to negative will sort elements in decending order
    return val;
  }

  @Override
  public String toString() {
    return (
      "Employee [eno=" +
      eno +
      ", ename=" +
      ename +
      ", esal=" +
      esal +
      ", eaddr=" +
      eaddr +
      "]\n"
    );
  }
}

public class Runner {

  public static void main(String[] args) {
    Employee emp1 = new Employee(001, "Durga", 5000, "Kurunegala");
    Employee emp2 = new Employee(002, "John", 6000, "Colombo");
    Employee emp3 = new Employee(003, "Rakesh", 2000, "Polonnaruwa");
    Employee emp4 = new Employee(004, "Sam", 4000, "Trincomalee");
    Employee emp5 = new Employee(005, "Krish", 5000, "Jaffna");

    TreeSet<Employee> ts = new TreeSet<Employee>();
    ts.add(emp4);
    ts.add(emp1); // emp1.compareTo(emp4); -ve

    ts.add(emp5);
    //emp5.compareTo(emp4);-ve
    // emp5.compareTo(emp1);+ve

    ts.add(emp3);
    //emp3.compareTo(emp4); -ve
    //emp3.compareTo(emp1);+ve
    //emp3.compareTo(emp5);+ve

    ts.add(emp2);
    //emp2.compareTo(emp4); -ve
    //emp2.compareTo(emp1);+ve
    //emp2.compareTo(emp5);-ve

    System.out.println(ts);
    //emp1, emp2, emp5, emp3, emp4
    // Durga, John, Krish, Rakesh, Sam
  }
}
