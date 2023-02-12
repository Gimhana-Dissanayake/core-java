
// 6. public Thread(ThreadGroup tg, Runnable r)
// It can be used to create Thread class object with the specified Thread Group
// Name and with the specified Runnable reference.
// NOTE: In this case, only ThreadGroup Name will be changed and the remaining
// thread properties are having default values like Thread Priority value is '5'
// and thread name is 'Thread-0'

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
        Thread t = new Thread(tG, r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("MainThread : " + i);
        }

    }

}