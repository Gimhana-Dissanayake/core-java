
class A{

    private static A a = null;

    static {
        System.out.println("A "+ a);
    }

    private A(){
        
    }

    static A getRef(){
        if(a == null){
            a = new A();
            
        }
        return a;
    }
}

public class Runner{
    public static void main(String[] args){

        A a1 = A.getRef();// Will start to load A class byte code to memory

        A a2 = A.getRef();

        A a3 = A.getRef();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}