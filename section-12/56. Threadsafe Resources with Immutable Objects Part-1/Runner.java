
// Immutable objects are normal java objects, they will not allow modifications on their content, if we are trying to perform modifications on its content then data is allowed for modifications but the resultent modified data will not be stored back in original object, where the resultent modified data will be stored by creating a new object.

// EX: String class objects are immutable objects
// All wrapper classes objects are immutable.

// In java applications, if we submit more than one thread on single String object [Immutable Object] and if more than one thread is perfoming modificiations on single immutable object content, then, at each and every modification a sperate new String object will be created, where new modified data will be stored, old object data is remains same, this approach will not allow overriding one thread modifications with another thread modifications, this approach will provide data consistency, it will make the resource as Threadsafe resource.

public class Runner {

}
