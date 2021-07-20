public class Runner {

    public static void main(String args[]) {
        A a = new A();
        a.m1();
        a.m1(10);
        a.m1(10, 20);
        a.m1(10, 20, 30);

        // In java applications, in var-arg method, it is possible to provide normal
        // parameters along with var-arg parameter, but, we must provide all the normal
        // parameters before var-arg parameter only, if we provide normal parameters
        // after var-arg parameter then compiler will raise an error, because, in
        // var-arg method, variable-argument parameter must be the last parameter.
        a.m2(22.2f, 10, 20, 30, 40);

        // Q) is it possible to provide more than one var-arg parameter in single
        // var-arg method?
        // Ans: No.

    }

}

class A {
    void m1(int... a) { // internally a will act as an array => int[] a = {10,20,30}
        System.out.println("No of arguments : " + a.length);
        System.out.println("Argument list :");
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            sum = sum + a[i];
        }
        System.out.println();
        System.out.println("Addition :" + sum);
        System.out.println("----------------------");
    }

    void m2(float fl, int... a) {
        System.out.println(fl);
        System.out.println("size " + a.length);
    }

    // Ex
    // void m1(int... a){} ----> valid
    // void m1(int... a, float f){} ---->invalid
    // void m1(float f, int ... a){} ----> valid
    // void m1(int ... i, float ... f){} ----> invalid

}
