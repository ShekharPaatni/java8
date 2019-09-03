package archive;

/**
 * @author Chandra Shekhar Paatni on 15/7/19
 */
public class SlidingMaxSumConsecutive {
    public static void main(String[] args) {
        System.out.println(maxSumConsecutive(new int[]{1, 2, 3, 1, 4, 5}, 3));
    }

    static int maxSumConsecutive(int[] arr, int slidingWindow) {
        int max = 0;
        for (int i = 0; i <= arr.length - slidingWindow; i++) {
            if (i == 0){
                for (int i1 = i; i1 < (i + slidingWindow); i1++) {
                    max += arr[i1];
                }
            } else {
                max -= arr[i - 1];
                max += arr[i+slidingWindow-1];
            }
        }
        return max;
    }
}
