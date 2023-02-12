
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        mt1.setName("AAA");
        mt2.setName("BBB");
        mt3.setName("CCC");

        mt1.start();
        mt2.start();
        mt3.start();

    }
}
