// public boolean isAlive()

public class Runner {
    // It can be used to check whether a thread is in live[Active] or not. If the
    // thread is in active state then isAlive() method will return 'true' value, if
    // the thread is not in active then isAlive() method will return 'false' value.

    // NOTE:In java application, when we create thread class object then the
    // generated Thread is not in active state, when we access start() method over
    // the thread reference then only the generated thread will be in active state

    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.isAlive());// false
        t.start();
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false
        System.out.println(t.isAlive());// true or false

    }
}

// Watch the lecture