package archive;

/**
 * @author Chandra Shekhar Paatni on 16/7/19
 */
public class WaveArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        convertToWave(arr, 5);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
    public static void  convertToWave(int arr[], int n) {
        for (int i = 0; i < arr.length-1; i+=2) {
            swap(arr, i, i+1);
        }
    }

    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
