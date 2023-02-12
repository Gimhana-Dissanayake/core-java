
// public Thread(ThreadGroup tg, String name)
// It can be used to create a Thread class object with the specified ThreadGroup
// Name and with the specified Thread Name.

// NOTE: In java applications, to provide a particular Thread Group name we have
// to use java.lang.ThreadGroup class object.
// ThreadGroup tG = new ThreadGroup("Group Name");

public class Runner {
    public static void main(String[] args) {

        ThreadGroup tG = new ThreadGroup("Java");
        Thread t = new Thread(tG, "gim");
        System.out.println(t);// Thread[gim, 5, java]

    }
}