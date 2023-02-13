public class Runner {

}

// If we want to make a resource as threadsafe resource then we have to use the
// following approaches.

// 1. Use Local Variables Over Instance Variables.
// 2. Use Immutable Objects Over Mutable Objects.
// 3. Use Synchronization.

// 1. Use Local Variables Over Instance Variables.
// In java applications, if we declare any variable inside a method then that
// variable is called as Local variable

// In Java applications, local variables data will be stored in stack memory.

// If we create multiple threads in java applications then a seperate stack will
// be created in stack memeory for each and every thread.

// If any thread access the local variable of a method then the respective local
// variable value will be stored in the threads respective stack only.

// If muliple threads access the same local variable then multiple copies of the
// respective local variable will be stored in threads respective stacks.

// If any thread performs modification on local variable then that modificiation
// is available upto the threads respective stack only, one thread modificiation
// is not available to other threads.

// If we declare any non static variable at class level then that variable is
// called as an instance variable.

// In java applications, instance variables data will be stored inside the
// objects in heap memory.

// In general, Heap memory objects are shared object for multiple threads, so
// all the threads can access the same data, it may provide data inconsistency.