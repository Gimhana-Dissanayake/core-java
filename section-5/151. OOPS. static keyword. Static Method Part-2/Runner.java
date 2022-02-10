
class A{

    int i = 10;
    static int j = 20;
    

    static void m1(){
        System.out.println("m1-A");
        // System.out.println(i); --> Error

        System.out.println(j);
        A a = new A();
        System.out.println(a.i);
        // System.out.println(this.j); --> Error

    }
    void m2(){
        System.out.println("m2-A");
        this.m1();
    }
}

class B{
    B(){
        System.out.println("B-Con");
    }

    static int i = m1();//This is to demonstrate that static methods are called at load time

    //instance methods can only be accessed during instance time /runtime not during load time.
    //static methods can be executed both at load time and run time

    static int m1(){
        System.out.println("m1-B");
        return 10;
    }

    int j = m1();

}

public class Runner {

    public static void main(String[] args){
        // A a = new A();
        // a.m1();
        // A.m1();

        // A a1 = null;
        // // a1.m2(); //null pointer exception here
        // a1.m1();
        // a.m2();


        B b = new B();

        System.out.println(b);

    }

    //Q What are the difference between static method and instance method?
    //Ans: In Java applications, Static methods are executed at both load time and at runtime, that is, in both static context and instance context. In java applications, Instance methods are executed at instance context only, not at static context.

    //2.In java applications, static methods are accessed either by creating object for the respective class or by using the respective class name directly.

    //In Java applications, instance methods are accessed by creating object for the respective class only;

    //3.Static methods are able to allow only static members of the current class directly.

    //Instance methods are able to allow both static memembers and instance memebers of the current class.

    //4. 'this' keyword is not possible inside static methods. 'this' keyword is possible inside instance methods.

    //5. java.lang.NullPointerException is possible in the case of instance methods, that is ,if we access instance methods by using a reference variable containing null value then JVM will raise an exception like java.lang .NullPointerException


    
}
