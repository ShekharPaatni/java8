/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.util.*;
/*
class CandidateCode {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCase = scanner.nextInt();
        if (numberOfTestCase >=1 && numberOfTestCase<=100) {
            for (int i = 0; i < numberOfTestCase; i++) {
                System.out.println(getNumberOfTestCase(scanner.nextInt()));
            }
        }
    }
    public static int getNumberOfTestCase(int number) {
        int numberOfSteps = 0;
        if (number >= 1 && number <= Math.pow(10, 7)) {
            while (number > 1) {
                if (number%2 != 0 && number!=0) {
                    number -=1;
                    numberOfSteps++;
                }
                if (number/2 >= 1) {
                    number /=2;
                }
                numberOfSteps++;
            }
            return numberOfSteps;
        }
        return numberOfSteps;
    }
}
*/
