public class Runner {

}

// In general, in java applications, there are four types of scopes for the
// data.

// 1.private
// 2.<default>
// 3.protected
// 4.public

// where 'private' scope is able to make availabe data upto the present class.

// where '<default>' scopre is able to make avaialbe data upto the present
// package.

// where 'protected' scope is able to make availabe data upto the present
// package and the child class in other packages.

// where 'public' scope is able to make available data through out the
// application.

// Simillarly, I want to make availabe data upto all the resource which are
// accessed by a particular thread, for this, we have to define a seprate scope
// for the data that is 'ThreadScope'.

// In java applications, if we want to define 'ThreadScope' for the Data java
// has provided a predefined class in the form of 'java.lang.ThreadLocal' class.

// Where 'ThreadLocal' class has provide the following methods to keep data in
// ThreadScope, to get data from ThreadScope, to remove data from ThreadScope
// and to provide default data in ThreadScope.

// 1. public void set(Object data): To set data in ThreadScope.
// 2. public Object get(): To get data from ThreadScope.
// 3. public void remove(): To remove Data from ThreadScope.
// 4. public void initialValue(): To provide intial value in ThreadScope, it
// will be executed to send value when we access data from ThreadScope without
// setting data