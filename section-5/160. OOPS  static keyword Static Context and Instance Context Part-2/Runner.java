class A{
    static {
        System.out.println("SB-A");
    }

    {
        System.out.println("IB-A");
    }


    static int i = m1();
    int j = m2();

    static int m1(){
        System.out.println("m1-A");
        return 10;
    }

    int m2(){
        System.out.println("m2-A");
        return 20;
    }


    A(){
        System.out.println("A-Con");
    }

}

public class Runner {
    public static void main(String[] args){
        A a1 = new A();
        System.out.println("---creating second object---");
        A a2 = new A();
    }   
}
