
class A {
    synchronized void display() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class DisplayThread extends Thread {
    A a;

    public DisplayThread(A a) {
        this.a = a;
    }

    public void run() {
        a.display();
    }
}

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        DisplayThread thread1 = new DisplayThread(a);
        DisplayThread thread2 = new DisplayThread(a);
        DisplayThread thread3 = new DisplayThread(a);

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");
        thread3.setName("Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
