

class A{
    int i = 10;
    static int j = 10;
}

public class Runner {
    //In java applications, single copy of static variable value will be shared to all the objects [previous objects and Future objects], but, individual copy of instance variable will be available to each and every object. A seperate copy of instance variable value will be available to each and every object.

    //In java bytecode will be loaded only one time

    public static void main(String[] args){
        A a1 = new A();
        System.out.println(a1.i + " " +a1.j);
        a1.i = a1.i + 1;
        a1.j = a1.j + 1;

        System.out.println(a1.i + " " +a1.j);

        A a2 = new A();
        System.out.println(a2.i + " "+a2.j);
        a2.i = a2.i + 1;
        a2.j = a2.j + 1;
        System.out.println(a1.i + " " +a1.j);
        System.out.println(a2.i + " " +a2.j);

        A a3 = new A();
        System.out.println(a3.i+ " " + a3.j);
        a3.i = a3.i + 1;
        a3.j = a3.j + 1;
        System.out.println(a1.i + " " +a1.j);
        System.out.println(a2.i + " " +a2.j);
        System.out.println(a3.i+ " " + a3.j);

    }




}
