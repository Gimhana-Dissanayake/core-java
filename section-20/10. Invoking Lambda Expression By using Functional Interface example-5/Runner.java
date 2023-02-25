class MyRunnable implements Runnable {

  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Child thread");
    }
  }
}

public class Runner {

  public static void main(String[] args) {
    //Without using lambdas
    Runnable r = new MyRunnable();
    Thread t = new Thread(r);
    t.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main thread");
    }

    // With lambdas
    Runnable r1 = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Child thread 2");
      }
    };

    Thread t1 = new Thread(r1);
    t1.start();
  }
}
