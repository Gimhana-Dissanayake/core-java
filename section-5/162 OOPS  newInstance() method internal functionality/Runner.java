
class A{
    static {
        System.out.println("Class loading...");
  
    }

    
    A(){
        System.out.println("Object Creating...");
    }
}

public class Runner {
    
    public static void main(String[] args) throws Exception{
        
        Class c = Class.forName("A");//if A.class is available jvm will take A.class file and jvm will load A class byte code to the memory when ever A class byte code is loaded to the memory automatically jvm will get meta data of the repective loaded class and that meta data will be stored in the form of java.lang.Class object in heap memory.

        Object obj = c.newInstance();//Contructor of the A class should not be private and should have zero argument constructor

    }

}
