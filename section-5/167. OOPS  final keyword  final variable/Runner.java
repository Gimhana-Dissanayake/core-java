
class A{
    final int i;
    A(){
        i = 10;
    }
    public int getVal(){
        return i;
    }
}

public class Runner {
    
    //1. final variables
    //2. final methods
    //3. final classes

    //1. final variables

    //---> final variables is a java variable, it will not allow modifications on its content. 

    //---> final variables are not allowing re-assignments


    public static void main(String[] args){
        A a = new A();
        System.out.println(a.getVal());
    }

}
