// public Thread(ThreadGroup tg, Runnable r, String name)
// It can be used to create Thread class object with the specified ThreadGroup, Runnable reference and the provided Thread Name.

// NOTE: In this case, Thread Group Name and Thread Name will be changed but Thread priority value will be the default value that is 5
class WelcomeThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("WelcomeThread : " + i);
        }
    }
}

public class Runner {

    public static void main(String[] args) {
        Runnable r = new WelcomeThread();
        ThreadGroup tG = new ThreadGroup("Java");
        Thread t = new Thread(tG, r, "gim");
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("MainThread : " + i);
        }
    }

}
