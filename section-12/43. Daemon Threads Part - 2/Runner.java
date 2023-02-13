class GarbageCollector extends Thread {
    public void run() {
        while (true) {
            System.out.println("Garbage Collector Thread");
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        GarbageCollector gc = new GarbageCollector();
        gc.setDaemon(true);
        gc.start();
        // gc.setDaemon(true); // if we do this here we will get a
        // java.lang.illegalThreadStateException
        for (int i = 0; i < 10; i++) {
            System.out.println("JVM Thread");
        }
        System.out.println(gc.isDaemon());
    }
}
