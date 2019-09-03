package archive;

/**
 * @author Chandra Shekhar Paatni on 16/7/19
 */
public class MaxOccur {
    public static void main(String[] args) {

    }
    public static int maxOccured(int L[], int R[], int n, int maxx) {
        int []auxMemory = new int[maxx+1];

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
}
