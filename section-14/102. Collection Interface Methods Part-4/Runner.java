import java.util.ArrayList;

// 3. public boolean remove(Object obj):
// It can be used to remove the specified element from the present collection.
// If the element is removed successfully then remove() method will return rrue value.
// If the element is not removed form the collection object then remove() method will return false value

public class Runner {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("AAA");
        al.add("BBB");
        al.add("CCC");
        al.add("DDD");

        System.out.println(al);
        System.out.println(al.remove("BBB"));// true
        System.out.println(al.remove("CCC"));// true
        System.out.println(al);
        System.out.println(al.remove("BBB"));// false
        System.out.println(al.remove("CCC"));// false
        System.out.println(al);
    }
}
