package archive.dss.iteration;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        int f0 = 0, f1 = 1, f3 = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 0)
                System.out.println(f0);
            else if (i == 1)
                System.out.println(f1);
            else {
                f3 = f0 + f1;
                f0 = f1;
                f1 = f3;
                System.out.println(f3);
            }
        }
    }
}
