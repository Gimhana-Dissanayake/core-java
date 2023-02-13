public class Runner {

}
// Daemon Thread is a thread running internally and providing services to some
// other thread, Daemon threads will be terminated automatically when the
// threads
// which are taking services from daemon threads are terminated

// Gargbage Collector inside JVM is Daemon Thread.

// When we start JVM to exectute a particular java application, internally,
// Garbage Collector will be executed and it is providing Garbage Collection
// service to JVM. When JVM terminates Garbage Collector will also get
// terminated automatically.

// In java applications, to make a thread as daemon thread we should use the
// following method

// public void setDaemon(boolean b)
// if b value is true then the thread will be daemon thread.
// if b value is false then the thread will not be daemon thread.

// NOTE: If we want to make a thread as daemon thread then we have to access
// setDaemon(true) method before accessing start() method, because, once if we
// start a thread then it will not allow to change its state, if we access
// setDaemon(true) method after acessing start() method then JVM will raise an
// exception like "Java.lang.IllegalThreadStateException"

// To check whether a thread is daemon thread or not we have to use the
// following method
// public boolean isDaemon();