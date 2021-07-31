public class Runner {

  // When we are creating an object

  A a = new A();

  // When we create object a,JVM loads A class byte code is loaded to the memory
  // and after that JVM creates object for the class. In a nutshell two actions
  // happen,

  // 1. Class loading ---> When we load perticular class byte code to memory
  // automatically context is created. This context is called static context
  // 2. Object creating ----> When we create an object automatically another
  // context will be created, that context is called instance context

  // In java, instance context is represented in the form of
  // 1. Instance variables. ---> Instance variable is a variable whose values are
  // varied from one instance to another instance of an object.In java
  // applications, instance variables are recognized and initialized just before
  // accessing the respective class constructor.In java applications, all instance
  // variables must be declare as class level variables, not at all possible to
  // declare as local variables.In java applications, all instance variables data
  // will be stored in the form of objects inside heap memory.In java
  // applications, we are able to access instance variables by creating object for
  // the respective class and by using the generated reference variables.

  // 2. Instance methods ---> It is a normal java method, it a set of
  // instructions, it will represent a particular action or behaviour of an entity
  // class. In java, instance methods are recognized and executed the moment when
  // we access that method. In java applications, we are able to access instance
  // methods by creating object for the respective class and by using the
  // generaged reference variable.

  // 3. Instance blocks ---> It is a set of instructions, which are recoginzed and
  // executed just before executing the respective class constructor.It is having
  // almost all the constructor power, we can use instance block as like
  // constructor.

  public static void main(String[] args) {
    A a = new A();
    System.out.println("---------------");
    C b = new C();
  }

}

class A {

  // Instance blocks will be executed in the same order we have declared them
  {
    System.out.println("IB1-A");
  }

  A() {
    System.out.println("A-Con");
  }

  {
    System.out.println("IB2-A");
  }

}

class C {

  // Before executing the contructor, if we have an instance context, then JVM
  // will execute it first. The instance context here is instance variable,
  // instance methods, and instance blocks. If you have instance variable,
  // instance methods, and instance blocks they have to be executed first before
  // the constructor

  // Instance methods will be executed if we call them only.
  // Instance variables and instance blocks are executed in the order we provide
  // them

  C() {
    System.out.println("C-Con");
  }

  int i = m1();
  {
    System.out.println("IB-C");
  }

  int m1() {
    System.out.println("m1-C");
    return 10;
  }
}
