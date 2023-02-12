
// public void join() throws InterruptionException
// ---> This method can be used to pass present [Main Thread] to Complete
// another thread, after completion of other thread automatically the pased
// thread will continue its excution part.

class WelcomeThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("welcomeThread " + i);
        }
    }
}

public class Runner {
    public static void main(String[] args) throws Exception {
        WelcomeThread wt = new WelcomeThread();
        wt.start();

        wt.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("mainThread " + i);
        }
    }
}

// watch the lecture
