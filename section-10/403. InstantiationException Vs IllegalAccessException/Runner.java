
// Q) In the case of newInstance() method, if the respective loaded class does
// not have 0-arg constructor then JVM will raise
// java.lang.InstantiationException, if the respective loaded class has private
// constructor then JVM will raise java.lang.IllegalAccessException, in the
// case, if the repsective laoded class contains parameterized contructor and
// private constructor then JVM will raise an Exception, here which exception
// will JVM raise?

class Employee {
    static {
        System.out.println("Employee calss loading...");
    }

    private Employee(int i) {// java.lang.IllegalAccessException, because the ctor is private
        System.out.println("Employee Object is creating...");
    }
}

public class Runner {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Employee");
        Object obj = c.newInstance();
    }
}

// Ans: In the above context, JVM will give first priority for checking 0-arg
// constructor when compared with private constructor, so, JVM will raise
// java.lang.InstantiationException.