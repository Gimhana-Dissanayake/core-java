
class A {
    int m1() {
        try {
            int i = 100;
            int j = 0;
            float f = i / j;
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            return 30;
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        int result = a.m1();
        System.out.println(result);
    }
}
