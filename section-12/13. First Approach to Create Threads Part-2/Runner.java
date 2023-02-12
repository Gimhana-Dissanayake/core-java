// Watch this lecture again
class WelcomeThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome Thread: " + i);
        }
    }
}

// start method will create a new thread and it will send this thread to run
// method, so automatically new flow of execution will be created. The new flow
// of execution will execute the run method, which has our logic

// In this program context switching will occure because, welcome thread is
// executed with the main thread

// Each time we run this program the out will vary

public class Runner {

    public static void main(String[] args) {
        WelcomeThread wT = new WelcomeThread();
        wT.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
        }

    }

}
