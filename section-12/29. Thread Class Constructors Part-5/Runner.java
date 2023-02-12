
// public Thread(Runnable r, String name)
// It can be used to create thread class object with the provided Runnable
// reference and with the specified Thread Name.

// Note: In this case, only Thread name is changed and the remaining thread
// properies are having default values like Thread Priority value is '5' and
// Thread group name is 'main'

class HelloThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloThread : " + i);
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        Runnable r = new Thread();
        HelloThread hT = new HelloThread();
        Thread t = new Thread(r, "gim");
        Thread t1 = new Thread(hT, "hello");
        System.out.println(t);// Thread[gim,5,main]
        System.out.println(t1);// Thread[hello,5,main]
    }
}