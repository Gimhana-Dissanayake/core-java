public class Runner {

    // There are two types of objects in java
    // 1. Immutable objects
    // 2. Mutable objects

    // Q: What is the difference between immutable objects and mutable objects

    // Ans:
    // Immutable object is a java object, it will not allow modifications on its
    // content, if we are trying to perform modifications on its content then data
    // is allowed for modifications, but, the resulting modified data will not be
    // store back in the original object.The resulting modified data will be stored
    // in a new object of the same class.

    // EX: All String classes objects are immutable objects.
    // All Wrapper classes objects are immutable objects.

    // Mutable objects are the java objects, which are able to allow modifications
    // on their content direclty.
    // EX: Bydefault, all java objects are mutable objects only.
    // StringBuffer

    public static void main(String[] args) {
        String str1 = new String("Sky ");
        String str2 = str1.concat("is ");
        String str3 = str2.concat("blue");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("---------------------------");

        StringBuffer sb1 = new StringBuffer("Sky ");
        StringBuffer sb2 = sb1.append("is ");
        StringBuffer sb3 = sb2.append("blue");

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

    }

}
