public class Runner {

}

// Deadlock is a situation where more than one thread is depending on each other
// in circular dependency

// In java applications, when we get deadlock, JVM will struck its execution
// over the program.

// In java applications, once if we get deadlock then it is not possible to come
// back from deadlock, in java applications, we have to prevent deadlock
// situations, because, we are unable to have any reconvery mechanism from
// deadlock, we are able to use prevention mechanism.

// EX: RegisterCourseThread : Reasources -> courseName, trainerName
// CancelCourseThread : Reasources -> courseName, trainerName

// Level1: RegisterCourseThread holds courseName and CancelCourseThread holds
// trainerName

// Level2: RegisterCourseThread trying to get trainerName resouce which was
// already locked by CancelCourseThread. CancelCourseThread trying to get
// courseName resource which was alsready locked by RegisterCourseThread