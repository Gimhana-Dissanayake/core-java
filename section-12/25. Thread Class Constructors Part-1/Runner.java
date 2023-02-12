
// Thread class library:
// Constructors:
// -------------------------

// 1. public Thread()
// It can be used to create Thread class boject with the default values for
// thread name, thread priority value and thead group name.

// Default value
// 1. Thread Name: Thread-0;
// 2. Thread Priority Value: 5
// 3. Thread Group Name: main

public class Runner {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t);// Thread[Thread-0, 5, main]
    }
}