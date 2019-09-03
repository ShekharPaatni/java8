package archive;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Chandra Shekhar Paatni on 15/6/19
 */
public class NearestPerfectSquare {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        if (T >= 1 && T <= 100) {
            while (T > 0 ) {
                BigInteger max = BigInteger.ZERO;
                BigInteger number = scanner.nextBigInteger();
                for (BigInteger bigInteger = number.subtract(BigInteger.ONE);
                    bigInteger.doubleValue() > BigInteger.ZERO.doubleValue();
                    bigInteger = bigInteger.subtract(BigInteger.ONE)
                ) {
                    double pow  = Math.pow(bigInteger.doubleValue(), 0.5);
                    if ((pow - Math.floor(pow)) == 0  && bigInteger.doubleValue() != BigInteger.ONE.doubleValue()) {
                        max = bigInteger;
                        break;
                    }
                }
                System.out.println(max);
                T--;
            }
        }
    }
}