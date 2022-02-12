class A{
    static int m1(){
        System.out.println("m1-A");
        return 10;
    }

    static {
        System.out.println("SB-A");
    }

    static int i = m1();

}

public class Runner {
    public static void main(String[] args){

        
        A a1 = new A();
        A a2 = new A();


    }
}
