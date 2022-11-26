
class A {

}

class B {
    A a = new A();
    // ---> HAS - A relationship
}

class C {

}

class D extends C {
    // ---> IS - A relationship

}

class E {

}

class F {
    void m1() {
        E e = new E();// USES - A relationship
    }

}

// It is a relation between entity classes, where one instance of an entity must
// be used upto a particular behaviour of another entity.

// In USES-A Relationship, we need to create one entity object in another entity
// class provided method, if the respective method execution is completed then
// the first entity instance must be destroyed.

public class Runner {

}