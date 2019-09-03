package archive;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Chandra Shekhar Paatni on 17/6/19
 */
public class GP {
    public static void main(String[] args) {
//        System.out.println(power());
    }


    static long power(int N, int R) {
        int rev = 0;
        int tempN = N;
        int count = 0;
        while (N > 0) {
            int temp = N % 10;
            rev = temp + (rev * 10);
            N /= 10;
            count++;
        }
        Double d = Math.pow(tempN, rev);
        return (d.intValue()) % 1000000007;
    }
}
