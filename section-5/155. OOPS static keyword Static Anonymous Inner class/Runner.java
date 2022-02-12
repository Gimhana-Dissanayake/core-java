
public class Runner {
    //Q) It is possible to display a line of text on command prompt without using main() method, static varialbes, static method and static block

    //Ans:

    //Yes, It is possible to display a line of text on command prompt without using main() method, static variable, static method and static block, but, we must use 'Static anonymous inner class of Object class'. This question and answer is onlhy valid for java version 6 and below

    static Object o =  new Object(){
       {
           System.out.println("Welcome boi");
           System.exit(0);
       };
    };
}
