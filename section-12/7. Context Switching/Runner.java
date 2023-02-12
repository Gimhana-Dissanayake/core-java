public class Runner {

}

// In multi process mechanism, controlling is switch from one process context
// to another process context. so, this type of switching between process
// contexts is called as "Context Switching".

// 1. Heavy Weight Context Switching:
// It is the context switching between two heavy weight components.
// Ex - Context Swtiching between two processes.
// Heavy weight context switching will increase application execution time.
// It will reduce application perfoormance

// 2. Light weight context switching
// It is the context swithcing between two light weight components.
// Ex - Context swithing between two threads.
// Light weight context switching will reduce applicaction execution time.
// It will increase application performance.