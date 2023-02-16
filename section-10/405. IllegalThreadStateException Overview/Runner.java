
// IllegalThreadStateException:
// In java applications, if we want to make a thread a daemon thread then we
// have to access the following method from java.lang.Thread class

// public void setDaemon(boolean b)
// If b value is true then thread will be daemon thread.
// If b value is fale then thread wil not be daemon thread.

// NOTE: we must access setDaemon() befroe starting thread, we must not access
// setDaemon() after starting the thread. If we access setDaemon() after
// starting the thread then JVM will raise IllegalThreaStateException.

class WelcomeThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome Thread " + i);
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        WelcomeThread welcomeThread = new WelcomeThread();

        welcomeThread.start();
        welcomeThread.setDaemon(true);
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread : " + i);
        }
    }
}

// Parts of an Exception provided by JVM

// 1. Exception Name: java.lang.IllegalThreadStateException
// 2. Exception Description: blah blah blah....
// 3. Exception Location: line number