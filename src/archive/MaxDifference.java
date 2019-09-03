package archive;

/**
 * @author Chandra Shekhar Paatni on 16/7/19
 */
public class MaxDifference {
    public static void main(String[] args) {
        System.out.println(maxIndexDiff(new int[]{34, 8 ,10, 3, 2, 80, 30, 33, 1}, 9));
    }
    static int maxIndexDiff(int arr[], int n) {
/*        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i+1; i1 < arr.length; i1++) {
                if (arr[i1] >= arr[i] && i1 - i > max)
                    max = i1-i;
            }
        }
        return max;*/

        int maxIndex = Integer.MIN_VALUE;
        int maxElement = arr[n-1];
        int maxElementIndex = n-1;
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxElementIndex = i;
            } else {
                maxIndex = Integer.max(maxIndex, Math.abs(maxElementIndex-i));
            }
        }
        return maxIndex;
    }
}
