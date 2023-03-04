import java.util.ArrayList;
import java.util.function.Function;

class Employee {

  String name;
  Double salary;

  public Employee(String name, Double salary) {
    this.name = name;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [name=" + name + ", salary=" + salary + "]";
  }
}

public class Runner {

  public static void main(String[] args) {
    ArrayList<Employee> list = new ArrayList<Employee>();
    populate(list);

    Function<ArrayList<Employee>, Double> f = empList -> {
      double total = 0;
      for (Employee e : empList) {
        total = total + e.salary;
      }
      return total;
    };

    System.out.println(f.apply(list));
  }

  public static void populate(ArrayList<Employee> l) {
    l.add(new Employee("Aravinda", 1000.00));
    l.add(new Employee("Madara", 5000.00));
    l.add(new Employee("Nayomi", 3000.00));
    l.add(new Employee("Malith", 2000.00));
    l.add(new Employee("Praveen", 9000.00));
    l.add(new Employee("Gayan", 12000.00));
    l.add(new Employee("Dulan", 7000.00));
  }
}
