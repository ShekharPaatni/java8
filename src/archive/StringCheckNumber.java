package archive;

/**
 * @author Chandra Shekhar Paatni on 16/6/19
 */
public class StringCheckNumber {
    public static void main(String[] args) {
        int x =8987;

        System.out.println(m(x));
    }

    private static int m(int x) {
        if (String.valueOf(x).length() == 1)
            return x;
        else {
            int sum  = 0;
            while (x > 0) {
                sum += x%10;
                x /=10;
            }
            x = sum;
        }
        return m(x);
    }
}
