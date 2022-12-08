
// in java applications, if we perform object cloning with out implment ava..lang.cloneable marker interface then JVM will raise an exception like java.lang.CloneNotSupportedException.

class Cal {
    int i = 10;
    int j = 20;

    public void display() {
        System.out.println(i + "   " + j);
    }

    public Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }
}

public class Runner {
    public static void main(String[] args) throws Exception {
        Cal originalObj = new Cal();
        originalObj.display();
        System.out.println();
        Cal dupObj = (Cal) originalObj.clone();
        dupObj.display();
    }

}
