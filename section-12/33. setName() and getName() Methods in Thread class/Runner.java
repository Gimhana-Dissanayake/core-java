
// Thread class methods:

// 1. public void setName(String name)
// It can be used to provide a particular name to the thread.

// 2. public String getName()
// It can be used to get the present name of the Thread

public class Runner {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.getName());// Thread-0
        t.setName("Core Java");
        System.out.println(t.getName());
    }
}
