package archive.arr_practice;

/**
 * @author Chandra Shekhar Paatni on 23/5/19
 */
public class FindMissingNumberInArray {
    static int[] arr = {1,2,3,4,5,7,8,9};

    public static void main(String[] args) {
        int sumOfNDigit = (9 *(9+1))/2;
        int tempSump = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSump += arr[i];
        }

        System.out.println("archive.Missing number is "+ (sumOfNDigit - tempSump));
    }
}