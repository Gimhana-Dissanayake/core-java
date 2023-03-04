class Test {

  public void m1() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Child Thread 1");
    }
  }
}

public class Runner {

  public static void main(String[] args) {
    // Without method reference
    System.out.println("Without method reference");
    Runnable r = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Child Thread");
      }
    };

    Thread t = new Thread(r);
    t.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread");
    }

    // With method reference
    System.out.println("With method reference");

    Test test = new Test();

    Runnable r1 = test::m1;
    Thread t1 = new Thread(r1);
    t1.start();

    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread 2");
    }
  }
}
