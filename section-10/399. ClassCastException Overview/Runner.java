public class Runner {

    // In java applications, we are able to keep sub class object reference value in
    // super class reference variable, but, we are unable to keep super class object
    // reference value in sub class reference variable, if we are trying to keep
    // super class object reference value in sub class reference variable then JVM
    // will raise an exception like java.lang.ClassCastException.

    public static void main(String[] args) {
        A a = new A();
        // B b = (B) a;// will give java.lang.ClassCastException
    }

}

class A {

}

class B extends A {

}