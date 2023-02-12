import java.util.ArrayList;

//  public int size():
// It can be used to get the no of elements which are existed in the present collection object.

// public boolean isEmpty():
// It can be used to check whether if the collection is empty or not. If empty true else false

// public void clear():
// It can be used to remove all the elements in the present collection

public class Runner {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> a2 = new ArrayList<String>();
        al.add("AAA");
        al.add("BBB");
        al.add("CCC");
        al.add("DDD");
        al.add("EEE");

        System.out.println(al);
        System.out.println(a2);
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(a2.isEmpty());
        al.clear();
        System.out.println(al);

    }
}
