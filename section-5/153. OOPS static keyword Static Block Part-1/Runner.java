
class A{

    int i = 10;
    static int j = 20;

    static{
        System.out.println("SB-A");
        // System.out.println(i);//compilation error
        System.out.println(j);
        A a = new A();
        System.out.println(a.i);
        // System.out.println(this.j);//compilation error
    }
}

public class Runner {
    

    // Note -> static block is a set of instructions, which are recoginzed and executed exactly at the time of loading the respective class bytecode.

    // In java applications, static block are able to allow static members of the current class, not allowing non static members of the current class.

    // Note: If we want to access non static members of the current class in static blocks tehn we have to create object for the respective and we have to use the generated reference variable.


    // static blocks are not allowing this keword in their body, if we use this keyword in static blocks then we are able to get a compilation error


    public static void main(String[] args){
        A a = new A();
    }

}

