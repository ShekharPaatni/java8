package archive;

/**
 * @author Chandra Shekhar Paatni on 15/7/19
 */
public class MaxOccuredInteger {
    public static void main(String[] args) {
        int max = maxOccured(new int[]{1, 5, 9, 13, 21}, new int[]{15, 8, 12, 20, 30}, 0, 0);
        System.out.println(max);
    }

    static int maxOccured(int L[], int R[], int n, int maxx) {
        int min = findMin(L);
        int max = findMax(R);
        int []auxMemory = new int[max+1];
        //less than min will store -1
        for (int i = 0; i < min; i++) {
            auxMemory[i] = -1;
        }
        //count of every element by 1;
        for (int i = 0; i < L.length; i++) {
            for (int i1 = L[i]; i1 <= R[i]; i1++) {
                auxMemory[i1] += 1;
            }
        }


        return findMaxOccuredInteger(auxMemory);
    }

    private static int findMaxOccuredInteger(int[] auxMemory) {
        int maxElement = -1, maxCount = -1;
        for (int i = 0; i < auxMemory.length; i++) {
            if (maxCount < auxMemory[i]) {
                maxCount = auxMemory[i];
                maxElement = i;
            }
        }
        return maxElement;
    }
    private static int findMax(int[] r) {
        int max = r[0];
        for (int i = 0; i < r.length; i++) {
            if (max< r[i])
                max = r[i];
        }
        return max;
    }

    static int findMin(int L[]) {
        int min = L[0];
        for (int i = 0; i < L.length; i++) {
            if (L[i] < min) {
                min = L[i];
            }
        }
        return min;
    }
}
