public class Runner {
    public static void main(String[] args) {
        Runnable r = new Thread();// Thread-0
        System.out.println(r);// Thread[Thread-0,5,main]
        Thread t = new Thread();// Thread-1
        System.out.println(t);// Thread[Thread-1, 5, main]

    }
}

// public Thread(Runnable r):
// It can be used to create Thread class object with the provided Runnable
// Reference.

// Note: In this case no changes in default values of the Thread properties.
// Thread Name: Thread-0
// Thread Priority Value: 5
// Thread Group Name: main