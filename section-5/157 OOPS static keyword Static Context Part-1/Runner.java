
class A{
    static {
        System.out.println("SB-A");
    }
    static int i = m1();
    static int m1(){
        System.out.println("m1-A");
        return 10;
    }

    int v = m2();

    int m2(){
        return 20;
    }
}

public class Runner {
    // static context

    //in java applications, when a class bytecode is loaded, automattically, a sperate context will be created that is "Static Context"


    //In java applications, static context is represented in the form of the following three elements.
    //1. static variables
    //2. static methods
    //3. static blocks


    //Where static variables and static blocks are recognized and executed automatically at the time of loading the respective class bytecode to the memory.

    //where static method will be recognized and executed the moment when we access that method.

    public static void main(String[] args){
        A a = new A();
        System.out.println(a.v);
    }

}
