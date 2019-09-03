package archive.array;

import java.util.Arrays;

/**
 * @author Chandra Shekhar Paatni on 20/6/19
 */
public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::print);
    }

    private static void rotate(int[] arr, int i) {
        while (i > 0) {
            int temp = arr[0];
            for (int i1 = 0; i1 < arr.length-1; i1++) {
                arr[i1] =  arr[i1+1];
            }
            arr[arr.length -1] = temp;
            i--;
        }
    }

    private static void reverse(int[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++; endIndex--;
        }
    }

}
