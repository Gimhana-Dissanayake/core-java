import java.util.ArrayList;

public class Runner {

  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();
    al.add("a");
    al.add("b");
    al.add("c");
    System.out.println(al); //sopln(al.toString())
  }
}
// In general, in java apllications, if we pass a particular class object reference variable as parameter to System.out.println(--) then JVM will access toString() method on the provided reference variable, here JVM will search for toString() method in the respective class whose reference variable we providied as parameter to Syste.out.println() method, if toString() method is not existed in the respective class then JVM will search for toString() method in its super class, if not super class is existed explicitly for the respective class then JVM will search for toString() method in the common and default super class that is Object class.
// In Object class, toString() method was implemented in such a way that to return a String contains "ClassName@RefValue"
// Collection classes are not depending on the object class provided toString() method,  all Collection classes, Object class provided toString() method was overridden in such as way that to return String contains all the return values of toString() methods which are accessed on all the elements of the respective collectin as a list seperated with, and enclosed with [].
// public class ArrayList implements List{
// public String toString(){
// String returnValue = "["
// int count = 0
// for(Object element: this){
// if(count == 0){
// returnValue = returnValue + element.toString()
// }else {
// returnValue = returnValue + "," +  element.toString();
// }
// count = count + 1;
// }
// returnValue = returnValue + "]"
// return returnValue
// }
// }
