
class A {

    // Every class in java extends java.lang.Object class
    // There are 8 methods in java.lang.Object class hashCode(), toString(),
    // getClass(), equals(), clone(), finalize(), wait(), wait(int time), wait(int
    // time, long time), notify(), notifyAll()

    // Every object in java has the above methods

}

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("hashCode " + a.hashCode());
        System.out.println("reference val " + a.toString());

    }
}
