package archive;

/**
 * @author Chandra Shekhar Paatni on 1/7/19
 */
public class Modulo {
    public static void main(String[] args) {
        long sum = sumUnderModulo(9223372036854775807l, 9223372036854775807l);
        System.out.println(sum);
    }
    public static long sumUnderModulo(long a, long b) {
        int M=1000000007;
        return((a%M)*(b%M))%M;
    }
}
