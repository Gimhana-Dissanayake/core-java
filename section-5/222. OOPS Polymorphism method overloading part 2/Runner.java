
class Math {
    void add(int a, int b) {
        System.out.println("ADD : " + a + b);
    }

    void add(float f1, float f2) {
        System.out.println("ADD : " + f1 + f2);
    }

    void add(String str1, String str2) {
        System.out.println("ADD : " + str1 + str2);
    }
}

public class Runner {
    public static void main(String args[]) {
        Math math = new Math();
        math.add(10, 10);
        math.add(22.22f, 22.22f);
        math.add("Jhon ", "Doe");
    }
}
