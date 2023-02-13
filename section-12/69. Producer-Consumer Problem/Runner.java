
class A {
    boolean flag = true;
    int itemCount = 0;

    public synchronized void produce() {
        try {
            while (true) {
                if (flag == true) {
                    itemCount = itemCount + 1;
                    System.out.println("Producer produced item - " + itemCount);
                    flag = false;
                    notify();
                    wait();
                } else {
                    wait();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void consume() {
        try {
            while (true) {
                if (flag == true) {
                    wait();
                } else {

                    System.out.println("Consumer consumed item - " + itemCount);
                    flag = true;
                    notify();
                    wait();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread {
    A a;

    Producer(A a) {
        this.a = a;
    }

    public void run() {
        a.produce();
    }
}

class Consumer extends Thread {
    A a;

    Consumer(A a) {
        this.a = a;
    }

    public void run() {
        a.consume();
    }
}

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        Producer p = new Producer(a);
        Consumer c = new Consumer(a);
        p.start();
        c.start();
    }
}