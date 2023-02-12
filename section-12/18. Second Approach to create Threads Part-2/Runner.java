// Watch the lecture - important

class MyThread implements Runnable {
    public void run() {
        // app logic
    }
}

public class Runner {
    public static void main(String[] args) {
        // Case-1:
        MyThread mT1 = new MyThread();
        // mT.start();No start method is found in Object class
        // Status: Compilation error

        // Case-2:
        MyThread mT2 = new MyThread();
        mT2.run();
        // Status: Here User Thread is not created, only Main Thread is executing
        // MyThread class's run method and main method, here no multi threading.

        // Case-3:
        MyThread mT3 = new MyThread();
        Thread t = new Thread();
        t.start();
        // Status: Here New Thread is created and it will be submitted to Thread class
        // run() method, but not, MyThread class run() method.

        // Case-4
        MyThread mT4 = new MyThread();
        Thread t1 = new Thread(mT4);
        t1.start();
        // Status : Valid, Here new Thread is created and it will be submitted to
        // MyThread class run() method.
    }
}
