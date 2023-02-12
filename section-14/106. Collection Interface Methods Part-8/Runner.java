import java.util.ArrayList;

// public Object[] toArray();
// It can be used to convert all the elements of the present Collection to the Object[].

public class Runner {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("AAA");
        al.add("BBB");
        al.add("CCC");
        al.add("DDD");
        al.add("EEE");
        System.out.println(al);
        System.out.println();
        Object[] elements = al.toArray();
        for (int index = 0; index < elements.length; index++) {
            System.out.print(elements[index] + " ");
        }
        System.out.println("\n---------------------");
        for (Object element : elements) {
            System.out.print(element + " ");
        }

    }

}
