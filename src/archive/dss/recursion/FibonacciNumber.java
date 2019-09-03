package archive.dss.recursion;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class FibonacciNumber {
    private static int count = 10;
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fiboCalc(0,1);
    }

    private static void fiboCalc(int f0, int f1) {
        if (count > 0) {
            int f3 = f0 + f1;
            System.out.println(f3);
            count--;
            fiboCalc(f1, f3);
        }
    }
}
