public class Runner {

}

// In java applications, synchronization allows only one thread at a time, if
// follows sequencial execution of the threads, if will increase application
// execution time, it will reduce application performance.

// In java applications, dont use synchronization unneccessarily, if the
// requriment is existed then only use synchronization other than that it is not
// advisable to use synchronize because it will reduce application performance.

// Q). In java applications, to achieve synchronization we have already
// synchronized methods approach then what is the requirement to use
// Synchronized Blocks?

// Ans:
// In java applications, to achieve synchronization if we use synchronized
// method then synchronization will be provided through out the method
// irrespective of the actual requirment, If we have reequirment of
// synchronization upto some of the instructions inside a mehtod and if we use
// synchronized method then synchronization will be applied through out the
// method unncessarily, it will reduce application performance.

// In the above context, if we want to improve application performance, we have
// to provide synchronization upto the required no of instructions not through
// out the method, if we want to provide synchronization upto the requried no of
// instructions we have to use "Synchronized Blocks"

// watch the lecture
