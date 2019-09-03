package archive;

/**
 * @author Chandra Shekhar Paatni on 22/7/19
 */
public class EquilibriumIndex {
    public static void main(String[] args) {
       int eIndex = equilibriumPoint(new long[] {1L, 3L, 5L, 2L, 2L}, 5);
        System.out.println(eIndex);
    }
    public static int equilibriumPoint(long arr[], int n) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i < n; i++) {
            rightSum += arr[i];
        }
        for (int i = 0; i < n -1; ++i) {
            if (i != 0) {
                leftSum += arr[i - 1];
                rightSum -= arr[i];
            }
            if (leftSum == rightSum)
                return i+1;
        }
        return -1;
    }
}
