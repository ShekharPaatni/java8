package archive.dss.ds.sort;

import java.util.Arrays;

/**
 * @author Chandra Shekhar Paatni on 17/5/19
 */
public class OwnHeapSortImpl {
    static int[] arr = {0,1,0,1,1,1,0,0};

    public static void main(String[] args) {

        int length = arr.length;

        OwnHeapSortImpl ownHeapSort = new OwnHeapSortImpl();
        for (int i = length/2 -1; i >= 0 ; i--) {
            ownHeapSort.heapify(length, i);
        }

        ownHeapSort.print();
        System.out.println("******************");
        //extracting element
        for (int i = length-1; i >=0  ; i--) {
            ownHeapSort.swap(0, i);
            ownHeapSort.heapify(i, 0);
        }

        //printing sorted archive.array
        ownHeapSort.print();
    }

    private void heapify(int length, int elementIndex) {
        int largestIndex = elementIndex;
        int leftChildIndex = (2*elementIndex) + 1;
        int rightChildIndex = (2 * elementIndex) + 2;
        if (leftChildIndex < length && arr[leftChildIndex] > arr[largestIndex])
            largestIndex = leftChildIndex;
        if (rightChildIndex < length && arr[rightChildIndex] > arr[largestIndex])
            largestIndex = rightChildIndex;
        if (largestIndex != elementIndex) {
            swap(elementIndex, largestIndex);
            heapify(length, largestIndex);
        }
    }

    private void swap(int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    private void print() {
        Arrays.stream(arr).forEach(System.out::print);
    }
}
