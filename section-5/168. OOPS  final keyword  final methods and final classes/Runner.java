
class A{
    void m1(){
        System.out.println("m1-A");
    }
}

class B extends A{
    void m1(){
        System.out.println("m1-B");
    }
}

public class Runner {
    
    //final method is a java method, it will not allow method overriding.
    //final methods are not allowing changes in its functionality, that is, not allowing method overridding.


    //3. final classes:

    // final class is a java class, it will not have sub classes, it will not allow inheritance.

    //In case of inheritance, super classes never be declared as final classes

    public static void main(String[] args){
        A a = new B();

        a.m1();
    }

}
