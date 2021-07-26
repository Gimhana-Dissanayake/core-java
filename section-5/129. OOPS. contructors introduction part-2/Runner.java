public class Runner {

}

// In java applications, we must provide the same class name as contructor name,
// if we provide different name to the constructor which is not same as class
// name then compiler will treat the provided contructor as normal java method
// and searching for return type, it is not existed so that compiler will raise
// an error like "IOnvalid method" declaration; return type required.

// In java applications, contructors are not allowing return types, if we
// provide return type to the constructor then the provided constructor syntax
// is converted as method syntax, so, compiler and JVM will treate the
// constructor as a normal java method, if we access that as like normal java
// method it will be executed.

// In java applications, constructors are not having the access modifiers like
// static, final, abstract,..., if we provide the access modifiers like static,
// final, abstract, ... to the contructor then compiler will raise an error like
// "Modifier xxx not allowed here"

// In java applications, contructors are allowing the access modifiers like
// public, protected, <default> and private, if we declare a contructor as
// private then compiler will not raise any error, but, the respective private
// constructor must be accessed within the same class, where it is declared