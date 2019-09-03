package archive;

import java.util.Arrays;

/**
 * @author Chandra Shekhar Paatni on 16/7/19
 */
public class FrequencyLimitedRangeArray {
    public static void main(String[] args) {
        int[] arr= new int[]{2, 3, 2, 3, 5};
        printFrequency(arr, 5);
      /*  for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
    }
    public static void printFrequency(int arr[], int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[arr[i] -1] ++;
        String s = Arrays.toString(a).replace("[", "").replace("]", "").replace(",", "");
        System.out.print(s);
    }
}
