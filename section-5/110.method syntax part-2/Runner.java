class A {

    native void m1(); // native is a java method declared in java applications but implmented in none
                      // java applications

    // volatile variables are available, but not volatile methods
    // transient variables are available, but not transient methods

    synchronized void m2() { // synchronized methods are possible
        System.out.println("hello");
    }

    // strictfp is allowed for both methods and variables

    // public, protected, <default> and private scope related modifiers are possible
    // for methods
    // These modifiers are also possible static, final, abstract, native,
    // synchronized, strictfp to provide some extra character for the methods

    // NOTE: java methods are able to allow more than one access modifier, they must
    // be provided in valid combination.

    // This is valid because, static and final are both against method overriding
    static final void m3() {
        System.out.println("Hello");
    }

    // This combination below is not valid, static methods needs a body and abstract
    // methods can't have a body. abstract method requires methods overriding and
    // static is against method overriding
    // static abstract void m4();

    // This comibination is not possible because final methods cannot be overriden,
    // where as abstract methods needs to be overriden, so there is a clash. Hence
    // this combination is not valid and we get an error
    // final abstract void m4();

    // Here private is no sharability, completely restricted, and abstract is more
    // sharable. abstract method needs to be overriden so it cannot be declared as
    // private
    // final abstract void m4();

    // this is possible
    // protected abstract void m4();

    // this is possible
    static synchronized void m4() {

    }

    // valid combinations
    // Ex - static final, static synchronized

    // Invalid combinations
    // Ex - static abstract, final abstract

}

public class Runner {
    public static void main(String[] args) {

    }
}
