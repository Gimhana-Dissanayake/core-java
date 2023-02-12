// Threads Design:

// 1. Approach-1 : by Extending Thread class
// 2. Approach-2 : by implementing Runnable Interface

// 1. Approach-1 : By Extending Thread class:

// a. Declare an User defined class.
// b. Extend user defined class form java.lang.Thread class
// c. Override Thread class run() method in user defined class. 
// NOTE: In run() method we must provide the application login which we want to execute by creating new thread.
// public void run()
// NOTE: java.lang.Runnable interface contains only one method that is run().
// d. In Main class, in main() method, create thread and execute run() method  provided implmentations.
// NOTE: To create Thread[Flow of execution] we have to use start() method from java.lang.Thread.
// public void start()

// NOTE: It will create new Thread[Flow of execution] and it will send that thread to run() method to execute

public class Runnable {

}
