
class HelloThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloThread : " + i);
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        Runnable r = new HelloThread();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("MainThread : " + i);
        }
    }
}
