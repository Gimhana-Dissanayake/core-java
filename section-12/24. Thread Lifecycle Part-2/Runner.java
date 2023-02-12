public class Runner {

}
// 1. New / Born State
// In Java applications, when we create Thread class object automatically thread
// will come to 'New or Born State'

// 2. Ready / Runnable State

// In Java applications, after creating thread, if we want to execute thread,
// thread required memory and execution time, to get memory and execution time
// we have to access start() method.

// In java applications, after accessing start() and before allocating system
// resource to a thread, this state is called a "Ready / Runnable State".

// 3. Running State

// In Java applicationos, after accessing start() and after getting system
// resources like memory and executing time, this state is called as 'Running
// State'.

// 4. Blocked State
// To keep a running thread into Blocked state
// a. Access sleep() method with a particular sleep time.
// b. Access suspend() method over running thread.
// c. Access wait() method over running thread.
// d. If we perform IO operations.

// To getback thread from Block State to Ready or Runnable State
// a. When sleep time is over
// b. If any other thread access resume() method.
// c. If any other thread access notify() or notifyAll() methods.
// d. When IO operations are completed.

// NOTE: If we want to keep a running thread to Ready / Runnable state directly
// then we have to use yield() method, it is not supported in windows operating
// system, because, it requried priority based manipulations, windows OS is not
// supporting priority based manipulations.

// 5. Dead / Destroyed State
// When we access stop() method over the running thread then that thread will
// come to Dead state.