package archive.dss.ds.sort;

import java.util.Arrays;

/**
 * @author Chandra Shekhar Paatni on 20/5/19
 */
public class HeapSortPractice {
    static int[] arr = {9,8,4,5,6,7,3,2,1};
    private static void swap(int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        //creating heaping
        for (int i = arr.length/2 -1; i >= 0 ; i--) {
            heapifyMe(arr.length, i);
        }

        for (int i = arr.length -1; i >= 0 ; i--) {
            swap(i, 0);
            heapifyMe(i, 0);
        }

        //Sorted archive.array printing
        printMe();
    }

    private static void heapifyMe(int sizeOfArray, int elementIndex) {
        int largestIndex = elementIndex;
        int leftChildIndex = 2 * elementIndex + 1;
        int rightChildIndex = 2 * elementIndex + 2;
        if (leftChildIndex < sizeOfArray && arr[leftChildIndex] > arr[largestIndex])
            largestIndex = leftChildIndex;
        if (rightChildIndex < sizeOfArray && arr[rightChildIndex] > arr[largestIndex])
            largestIndex = rightChildIndex;
        if (largestIndex != elementIndex) {
            swap(largestIndex, elementIndex);
            heapifyMe(sizeOfArray, largestIndex);
        }
    }

    private static void printMe() {
        Arrays.stream(arr).forEach(System.out::println);
    }
}
