import java.util.Scanner;
import java.util.function.Predicate;

class SoftwareEngineer {

  String name;
  int age;
  boolean isHavingGf;

  public SoftwareEngineer(String name, int age, boolean isHavingGf) {
    this.name = name;
    this.age = age;
    this.isHavingGf = isHavingGf;
  }

  @Override
  public String toString() {
    return "SoftwareEngineer [name=" + name + "]";
  }
}

public class Runner {

  public static void main(String[] args) {
    SoftwareEngineer[] list = {
      new SoftwareEngineer("Saman", 10, true),
      new SoftwareEngineer("Jagath", 12, false),
      new SoftwareEngineer("Kamal", 45, true),
      new SoftwareEngineer("Aravinda", 25, true),
      new SoftwareEngineer("Anoma", 15, false),
      new SoftwareEngineer("Nayomi", 50, true),
      new SoftwareEngineer("Rupa", 62, false),
      new SoftwareEngineer("Prabath", 75, true),
      new SoftwareEngineer("Suranga", 95, true),
      new SoftwareEngineer("Raj", 8, true),
    };

    Predicate<SoftwareEngineer> p = sw -> (sw.age >= 21) && sw.isHavingGf;

    for (SoftwareEngineer sw : list) {
      if (p.test(sw)) {
        System.out.println(sw + " Eligible for pub");
      } else {
        System.out.println(sw + " Not eligible for pub");
      }
    }
  }
}
