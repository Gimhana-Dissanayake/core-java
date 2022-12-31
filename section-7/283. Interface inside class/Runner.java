// Q. Is it possible to declare an interface inside a class?

// Ans:
// Yes, It is possible to declare an interface insdie a class, but, the respective implmentaion class of that interface must be provideded withing the same outerclass

class A{
    interface I{
        void m1();
        void m2();
        void m3();
    }

    class B implements I{
        public void m1(){
            System.out.println("m1-B");
        }
        public void m2(){
            System.out.println("m2-B");
        }
        public void m3(){
            System.out.println("m3-B");
        }
    }
}

public class Runner{
    public static void main(String[] args){
    A.I ai = new A().new B();
    ai.m1();
    ai.m2();
    ai.m3();
    }
}