
class A{
    static int i = 10;
    int j = 20;

    void m1(){
        // static int k = 30; static variables are not possible as local varialbles. This is because static variables provide more sharability and local varaibles are providing less sharability, These two dont go hand in hand, hence the error

        System.out.println("m1-A");
        System.out.println(this.i);

    }
}

public class Runner {
    public static void main(String[] args){

        A a = new A();

        System.out.println(a.i);
        System.out.println(A.i);

        A a1 = null;

        // System.out.println(a1.j) --> NullPointerException
        System.out.println(a1.i);

        a.m1();

    }
}
