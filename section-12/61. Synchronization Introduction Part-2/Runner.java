public class Runner {

}

// In java applications, we are able to achieve synchronization by using an
// access modifier in the form of "synchronized"

// In java applications, synchronization is going on the basis of Locking
// mechanisms.

// When we submit more than one thread to the synchronized are, where Lock
// Manager will assign lock to a particular thread, here which thread aquired
// lock form Lock Manager that thread is eligible to execute in synchronized
// area, when a thead execution is completed in synchronized are then that
// thread has to submit lock back to Lock Manager, when Lock Manager get the
// lock from a thread from synchronized area then Lock manager will assign that
// lock to another thread which is in waiting state. If any thread is executing
// synchronized area then lock manager will assing Lock to other threads.