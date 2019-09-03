package archive.dss.iteration;

import java.util.Random;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class Factorial {
    public static void main(String[] args) {
        int num = (int)new Random().nextInt(5);
        int fact = 1;
        System.out.println("Number " + num);
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
