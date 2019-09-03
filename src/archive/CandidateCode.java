package archive;

import java.util.Scanner;

class CandidateCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        if (sizeOfArray >=1 && sizeOfArray <= Math.pow(10, 5)) {
            int[] numberArray = new int[sizeOfArray];
            for (int i = 0; i < numberArray.length; i++) {
                numberArray[i] = scanner.nextInt();
            }
            System.out.println(getCost(numberArray));
        }
    }

    public static int getCost(int[] numberArray) {
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i]*numberArray[i];
            sum += numberArray[i]*numberArray[numberArray.length-1];

            for (int i1 = i; (i1 <= i+1 && i+1 < numberArray.length); i1++) {
                sum += numberArray[i1] * numberArray[i+1];
            }
        }
        return sum;
    }

}
