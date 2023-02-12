
// public static int activeCount();

// It can be used to get the no of threads which are active at present in our java application

// NOTE: In java applications, if we create a thread class object then the created thread is not active, when we access start() method then only Thread will come active state.

public class Runner {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());// 1
        Thread t1 = new Thread();
        t1.start();
        System.out.println(Thread.activeCount());// <=2

        Thread t2 = new Thread();
        t2.start();
        System.out.println(Thread.activeCount());// <=3

        Thread t3 = new Thread();
        t3.start();
        System.out.println(Thread.activeCount());// <=4

        // The value return by activeCount method is never greater than 4

    }
}

// watch the lecture