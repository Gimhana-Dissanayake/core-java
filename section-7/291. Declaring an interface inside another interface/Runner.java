// Is it possible to declare an interface inside another interface, but, the respective implementation class of the inner interface must be provided in the same outer interface.In this context, the provided implentaion class is acting as a static inner class

interface I1 {
    interface I2 {
        void m1();

        void m2();

        void m3();
    }

    class A implements I2 { // static inner class A
        public void m1() {
            System.out.println("m1-A");
        }

        public void m2() {
            System.out.println("m2-A");
        }

        public void m3() {
            System.out.println("m3-A");
        }
    }
}

public class Runner {

    public static void main(String[] args) {

        I1.I2 i12 = new I1.A();
        i12.m1();
        i12.m2();
        i12.m3();
    }

}
