//Q)Is it possible to overload main() method in Java Application?

//Ans:
//In java applications, it is possible to overload main() method, but, it is not possible to override main() method, because, in java applications, static methods overloading is possible, but, static methods overridding is not possible.

//In java applications, if we declare more than one method with the same name and with the different parameter list then it is called as Method overloading

public class Runner {
    public static void main(String[] args){
        System.out.println("String[]-main()-A");

    }

    public static void main(int[] args){
        System.out.println("int[]-main()-A");
    }

    public static void main(float[] args){
        System.out.println("float[]-main()-A");
    }
}
