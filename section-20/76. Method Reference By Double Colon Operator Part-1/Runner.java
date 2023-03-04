interface Interf {
  public void m1();
}

public class Runner {

  public static void m2() {
    System.out.println("Implementation by method reference");
  }

  // To refer the method there is only one condition that is both the reffering method and refered method should have the same arguments.
  // Method reference is an alternative syntax to lamba expressions

  public static void main(String[] args) {
    Interf i = Runner::m2;
    i.m1();
  }
}
