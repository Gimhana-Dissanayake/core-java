public class Runner {

    // Q) How it it possible to create user defined immutable class?

    // 1. Declare an user defined class as final class. -> There might be a change
    // of modifing data taking the subclasses. That is why we should not allow sub
    // classes

    // 2. Declare all properties as final and private

    // 3. Provide only getter methods, not to provide setter methods

    // 4. Declare the methods for any operation, where provide operations over the
    // data by creating a new object at each and every time.

    public static void main(String[] args) {
        Calculator cal1 = new Calculator(10);
        System.out.println(cal1 + " : Count : " + cal1.getCount());
        Calculator cal2 = cal1.increment();
        System.out.println(cal2 + " : Count : " + cal2.getCount());
        Calculator cal3 = cal1.decrement();
        System.out.println(cal3 + " : Count : " + cal3.getCount());
    }

}

final class Calculator {
    private final int count;

    public Calculator(int count) {
        this.count = count;
    }

    public Calculator increment() {
        Calculator cal = new Calculator(this.count + 1);
        return cal;
    }

    public Calculator decrement() {
        Calculator cal = new Calculator(this.count - 1);
        return cal;
    }

    public int getCount() {
        return this.count;
    }

}