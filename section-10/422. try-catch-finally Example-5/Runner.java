public class Runner {

}

// Q. Find the output from the following program

class A {
    int m1() {
        try {
            int i = 100;
            int j = 0;
            float f = i / j;
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            return 30;
        }
        // return 40; //unreachable statement
    }
}
