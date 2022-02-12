
class A{
    static {
        System.out.println("SB-A");
    }

    static int i = m1();

    static int m1(){
        System.out.println("m1-A");
        return 10;
    }

    A(){
        System.out.println("A-con");
    }

    // Instance context include 
    // 1.instance variables
    //2. instance methods
    //3. instance blocks

    {
        System.out.println("IB-A");
    }

    int j = m2();
    int m2(){
        System.out.println("m2-A");
        return 20;
    }
}

public class Runner {
    public static void main(String[] args){
        A a = new A();
        
    }
}
