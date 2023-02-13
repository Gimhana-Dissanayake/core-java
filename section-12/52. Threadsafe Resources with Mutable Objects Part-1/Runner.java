public class Runner {

}

// 2. User Immutable objects over mutable objects:

// Mutable objects is a java object, it allows modifications on its content
// directly.

// Ex: StringBuffer

// If we submit multiple threads on stringBuffer object to perform modifications
// then all the threads modifications are allowed in the same object, it will
// override one thread modifications with another thread modifications, it will
// provide data inconsistency, it will note make the respective resource as
// Threadsafe