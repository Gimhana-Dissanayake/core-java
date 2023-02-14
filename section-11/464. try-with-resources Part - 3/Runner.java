public class Runner {
    // In the above approach, developers must close the resources explicitly, here
    // developers may forget to close the resources, it is not giving guarantee to
    // close the resources.

    // In the above approach, to close the resources we have used try-catch-finally
    // inside finally block, it is giving confusion to the developers.

    // To overcome the above problems, JAVA7 has provided a seperate new feature
    // that is try-with-resources.

    // In the case of try-with-resources, we have to declare and create all
    // resources along with try block only and these resources are closed
    // automatically when JVM is coming out from try block.

    // Syntax:
    // try(Resource-1;Resource-2;....;Resource-n;){

    // }catch(ExceptionName refVar){}
    // finally{}
}
