class Sample {

  public Sample() {
    System.out.println("Sample Contructor triggered");
  }
}

interface Interf {
  public Sample get();
}

public class Runner {

  public static void main(String[] args) {
    // With constructor reference.
    System.out.println("With constructor reference");
    Interf i = Sample::new;
    i.get();

    System.out.println(
      "*********************************************************"
    );
    // Without constructor reference.
    System.out.println("Without constructor reference");
    Interf i1 = () -> {
      Sample s = new Sample();
      return s;
    };
    i1.get();
  }
}
// Watch the lecture
