
// public Thread(String name):
// It can be used to create Thread class object with the specified name.
// NOTE: with the above constructor we are able to provide a particular name to the thread, but, the priority value of the thread will be 5[Default priority value] and Thread Group name will be 'main' [Default Value].

public class Runner {
    public static void main(String[] args) {
        Thread t = new Thread("gim");
        System.out.println(t);// Thread[gim,5, main]

    }
}