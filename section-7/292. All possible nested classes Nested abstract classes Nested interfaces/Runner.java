public class Runner {

}

// 1. Class inside class

class A {
    class B {

    }
}

// 2. Abstract class inside class

class A {
    abstract class B {

    }
}

// 3. Interface inside class

class A {
    interface I {

    }
}

// 4. class inside an abstract class

abstract class A {
    class B {

    }
}

// 5. abstract class inside abstract class:

abstract class A {
    abstract class B {

    }
}

// 6. interface Inside an abstract class

abstract class A {
    interface I {

    }
}

// 7. class inside an interface

interface I {
    class A {

    }
}

// 8. abstract class inside interface

interface I {
    abstract class A {

    }
}

// 9. interface inside interface

interface I {
    interface I2 {

    }
}

// 10. classes, abstract classes, interface in a class

class A {
    class B {

    }

    abstract class B {

    }

    interface I {

    }
}

// 11. classes, abstract classes, interface inside abstract class
abstract class A {
    class B {

    }

    abstract class C {

    }

    interface I {

    }
}

// 12. classes, abstract classes, interfaces inside an interface

interface I {
    class A {

    }

    abstract class B {

    }

    interface I {

    }
}