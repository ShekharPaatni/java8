package archive.searching;

import java.util.Arrays;

/**
 * @author Chandra Shekhar Paatni on 22/5/19
 */
public class ExponentialSearch {
    static int [] arr = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        int indexValue = exponentialSearch(arr.length, 5);
        if (indexValue == -1)
            System.out.println("not found");
        else
            System.out.println("Found");
    }

    private static int exponentialSearch(int size, int elementSearch) {
        if (arr[0] == elementSearch)
            return 0;

        int i = 1;
        while (i < size && arr[i] <= elementSearch)
            i*=2;

        return subArray(i/2, Math.min(i, size), elementSearch);

    }

    private static int subArray(int low, int high, int elementSearch) {
        arr = Arrays.copyOfRange(arr, low, high+1);
        return binarySearch(0, arr.length, elementSearch);
    }

    private static int binarySearch(int low, int high, int elementSearch) {
        if (low <= high) {
            int mid = (low + high)/2;
            if (arr[mid] == elementSearch)
                return mid;
            if (arr[mid] > elementSearch) {
               return binarySearch(low, mid -1, elementSearch);
            }
            if (arr[mid] < elementSearch) {
               return binarySearch(mid+1, high, elementSearch);
            }
        }
        return -1;
    }
}
