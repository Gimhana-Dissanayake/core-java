
class WelcomeThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome Thread: " + i);
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        WelcomeThread wT = new WelcomeThread();
        Thread t = new Thread(wT);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
