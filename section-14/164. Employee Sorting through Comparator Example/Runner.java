import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Employee {

  String eid;
  String ename;
  int esal;
  String eaddr;

  public Employee(String eid, String ename, int esal, String eaddr) {
    this.eid = eid;
    this.ename = ename;
    this.esal = esal;
    this.eaddr = eaddr;
  }

  @Override
  public String toString() {
    return (
      "Employee [eid=" +
      eid +
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

class MyComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee e1, Employee e2) {
    int val = 0;

    if (Runner.sortingKey.equalsIgnoreCase("EID")) {
      val = e1.eid.compareTo(e2.eid);
    }

    if (Runner.sortingKey.equalsIgnoreCase("ENAME")) {
      val = e1.ename.compareTo(e2.ename);
    }

    if (Runner.sortingKey.equalsIgnoreCase("ESAL")) {
      val = Integer.valueOf(e1.esal).compareTo(Integer.valueOf(e2.esal));
    }

    if (Runner.sortingKey.equalsIgnoreCase("EADDR")) {
      val = e1.eaddr.compareTo(e2.eaddr);
    }

    if (Runner.sortingOrder.equalsIgnoreCase("ASC")) {
      return val;
    } else {
      return -val;
    }
  }
}

public class Runner {

  static String sortingKey = "";
  static String sortingOrder = "";

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int option = 0;
    MyComparator myComp = new MyComparator();

    Employee emp1 = new Employee("001", "Durga", 25000, "Hyd");
    Employee emp2 = new Employee("002", "Anil", 15000, "Pune");
    Employee emp3 = new Employee("003", "Nag", 62000, "Delhi");
    Employee emp4 = new Employee("004", "Phani", 30000, "Mambai");
    Employee emp5 = new Employee("005", "Krish", 50000, "Chennai");

    System.out.println("Employee Sorting Application");
    System.out.println("============================");

    while (true) {
      System.out.println();
      System.out.println("1. Sorting by EID");
      System.out.println("2. Sorting by ENAME");
      System.out.println("3. Sorting by ESAL");
      System.out.println("4. Sorting by EADDR");
      System.out.println("5. EXIT");
      System.out.println("Your Option   : ");
      option = scanner.nextInt();

      if (option > 0 && option <= 4) {
        System.out.println("Sorting order [ASC/DESC]  : ");
        sortingOrder = scanner.next();
      }

      switch (option) {
        case 1:
          sortingKey = "EID";
          break;
        case 2:
          sortingKey = "ENAME";
          break;
        case 3:
          sortingKey = "ESAL";
          break;
        case 4:
          sortingKey = "EADDR";
          break;
        case 5:
          System.out.println("***** Thank You *****");
          System.exit(0);
          break;
        default:
          System.out.println("Invalid Option, use options 1,2,3,4 and 5");
          break;
      }

      TreeSet<Employee> ts = new TreeSet<Employee>(myComp);
      ts.add(emp1);
      ts.add(emp2);
      ts.add(emp3);
      ts.add(emp4);
      ts.add(emp5);
      System.out.println(ts);
    }
  }
}
