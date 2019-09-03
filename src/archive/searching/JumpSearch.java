package archive.searching;

/**
 * @author Chandra Shekhar Paatni on 22/5/19
 */
public class JumpSearch {
    static int[] arr = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
       int searchIndex = jumpSearch(9);
       if (searchIndex == -1)
           System.out.println("Not found");
       else
           System.out.println("Found Element");
    }

    public static int jumpSearch(int searchElement) {
        int size = arr.length;

        int steps = (int) Math.floor(Math.sqrt(size));
        int prevSteps = 0, skippedSteps = steps;

        while (arr[Math.min(skippedSteps, size) -1] < searchElement) {
            prevSteps = skippedSteps;
            skippedSteps += steps;
            if (prevSteps >= size)
                return -1;
        }

        while (arr[prevSteps] < searchElement) {
            prevSteps++;
            if (prevSteps >= Math.min(skippedSteps, size))
                return -1;
        }

        if (arr[prevSteps] == searchElement)
            return prevSteps;

        return -1;

    }
}
