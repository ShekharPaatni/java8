package archive;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Chandra Shekhar Paatni on 15/6/19
 */
public class ConversionToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        if (T >= 1 && T <= 100) {
           while (T >= 1) {
               BigInteger N = scanner.nextBigInteger();
               if (N.doubleValue() >= 1 && N.doubleValue() <= Math.pow(10, 7)) {
                   int numberOfIteration = 0;
                   while (N.doubleValue() >= 1) {
                       if (N.doubleValue() % 2 == 0) {
                           N = N.divide(BigInteger.valueOf(2L));
                       } else {
                           N = N.subtract(BigInteger.ONE);
                       }
                       numberOfIteration++;
                   }
                   System.out.println(--numberOfIteration);
               }
               T--;
           }
        }
    }
}
