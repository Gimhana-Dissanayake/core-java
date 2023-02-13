public class Runner {

}

// Inter Thread Communication:
// ----------------------------
// The process of providing communication between more than one thread inorder
// to complete a paricualr task or a paricular job is called as Inter Thread
// Communication.

// To provide Inter Thread Communication we have to use the following methods
// from java.lang.Object class.

// a)wait(): To keep a running thread in waiting state.
// b)notify(): To give activation state to a particular waiting thread
// c)notifyAll(): To give notification to all the thread which are in waiting
// state.

// To use the above methods in java applications we have to provide
// synchronization, because, the above methods are able to perform their
// functionalities under synchronization only.

// In general, Inter Thread Communication is much useful while providing
// solutions to the problems like Producer-Consumer problems.

// watch the lecture