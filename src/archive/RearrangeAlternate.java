package archive;

import java.util.Arrays;

/**
 * @author Chandra Shekhar Paatni on 16/7/19
 */
public class RearrangeAlternate {
    public static void main(String[] args) {
        int[] temp = new int[]{1,2,3,4,5,6,7};
        rearrange(temp, 7);
        for (int i : temp) {
            System.out.print(i + " ");
        }

    }
    static void rearrange(int []arr, int n) {
        int[] a = Arrays.copyOf(arr, n);
        int startPoint = 0;
        int endPoint = n-1;

        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 0) {
                arr[i] = a[endPoint];
                endPoint--;
            } else {
                arr[i] = a[startPoint];
                startPoint++;
            }
        }
    }

    static void swap(int[] arr, int i , int j) {
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
