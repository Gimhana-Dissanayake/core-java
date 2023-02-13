public class Runner {

}

// Use Synchronization:
// Synchronization is a mechanism, it able to allow only one thread at a time,
// it unable to allow more than one thread at a time, it will allow other
// threads after completing the present thread execution.

// In general, in java applications, when we execute more than one thread on
// single data item, when we perform modifications on single data item more than
// one thread and when one thread modifications are overridden with another
// thread modifications there we will get data inconsistency, but,
// synchronization is allowing only one thread, there is no scope to override
// one thread modification with another thread modifications, there is no scope
// to get data inconsistency, so synchronization is always providing data
// consistency, by default, all synchronized resources are threadsafe.

// Note: by default, all synchronized resources are thread safe, but, all
// threadsafe resources need not be synchronized resources, because, we are able
// to make resource a Thread safe resrouce in multiple ways like by declaring
// local variables over instance varialbes and by using immutable objects over
// mutables,....