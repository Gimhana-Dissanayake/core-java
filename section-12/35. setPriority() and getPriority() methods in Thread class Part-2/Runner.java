
public class Runner {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.getPriority());// 5
        t.setPriority(3);
        System.out.println(t.getPriority());// 3
        t.setPriority(Thread.MAX_PRIORITY - 3);
        System.out.println(t.getPriority());// 7
        t.setPriority(Thread.MIN_PRIORITY + Thread.NORM_PRIORITY);
        System.out.println(t.getPriority());// 6

        Thread t1 = new Thread();
        System.out.println(t1.getPriority());
        t1.setPriority(15);// IllegalArgumentException
        t1.setPriority(-10);// IllegalArgumentException
        t1.setPriority(0);// IllegalArgumentException
        System.out.println(t.getPriority());

    }
}
