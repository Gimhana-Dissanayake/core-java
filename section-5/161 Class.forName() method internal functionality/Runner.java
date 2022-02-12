
class A{
    static {
        System.out.println("Class loading...");
        // System.exit(0);
    }

    
    A(){
        System.out.println("Object Creating...");
    }
}

public class Runner {
    
    public static void main(String[] args) throws Exception{
        
        Class c = Class.forName("A");//here we have to use fully qualified name

        //When JVM encounters this section. First jvm will search for A.class file in current location, jjava predifined library another location refered by classpath enviornment varaible

        //If the class is not found jvm will raise an exception(Class not found exception)

        //If the A class is found, immeidaly jvm will take A.class file and jvm will load A class's bytecode to the memory(method area in memory)

        //one bytecode is loaded all the metadata of the class is available in the form of java.lang.Class object directly
        
        //java.lang.Class object will be created in heap memory

        System.out.println(c.getName());

    }

}
