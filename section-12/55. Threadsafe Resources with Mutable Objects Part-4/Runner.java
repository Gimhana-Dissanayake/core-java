public class Runner {

}

// Immutable objects are java objects, which are not allowing modifications on
// its content. if we are trying to perform modificiations on its content then
// data is allowed for modification, but, th resultent modified data will not be
// stored back in original object, where the resultent modified data will be
// store by creating a new object.

// Ex: String, All wrapper classes.

// If we submit multiple threads on String object to perform modifications on
// its data then JVM will create a seperate new String object for each and every
// modification by the threads, this nature of String is able to provide data
// consistency in Threads concurrency, it will make the resources as Threadsafe.