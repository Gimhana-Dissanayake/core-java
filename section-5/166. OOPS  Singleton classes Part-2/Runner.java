//alternative one to singleton

class A{
    private static A a = null; 

    static {
        a = new A();
    }

    private A(){

    }

    static A getRef(){
        return a;
    }
}
//alternative two to singleton
class B{
    private static B b =  new B();

 
    private B(){

    }

    static B getRef(){
        return b;
    }
}

public class Runner {
 
    public static void main(String[] args){
        A a1 = A.getRef();// Will start to load A class byte code to memory

        A a2 = A.getRef();

        A a3 = A.getRef();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        B b1 = B.getRef();

        B b2 = B.getRef();

        B b3 = B.getRef();

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

}
