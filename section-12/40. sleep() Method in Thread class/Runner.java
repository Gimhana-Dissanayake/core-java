
// public static void sleep(long time) throws InterruptedException

// It can be used to keep a running thread into sleep state until the specified
// sleep time, if the sleep time is completed then the sleeping thread will com
// to active state automatically and continues its execution time.

class WelcomeThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println("welcome to earth");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        WelcomeThread wt = new WelcomeThread();
        wt.start();
    }
}
