package archive;

import java.util.*;

/**
 * @author Chandra Shekhar Paatni on 17/6/19
 */
public class DigitCalc {
    static Map<Integer,java.math.BigInteger> factorials = new LinkedHashMap<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(new DigitCalc().digitInFactorial(120));
        System.out.println(new DigitCalc().digitInFactorial(121));
    }

    int digitInFactorial(int N) {
        getFactorial(N);
        return factorials.get(N).toString().length();
    }


    void getFactorial(int num) {
        if (num >  factorials.size()) {
            int loop  = factorials.isEmpty() ? 1 : factorials.size();
            java.math.BigInteger result =  (factorials.isEmpty()) ? java.math.BigInteger.ONE  : factorials.get(factorials.size()-1);
            for (int i = loop; i <= num; i++) {
                result = result.multiply(java.math.BigInteger.valueOf(i));
                factorials.put(i, result);
            }
        }

    }
}
