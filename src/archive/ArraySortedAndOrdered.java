package archive;

/**
 * @author Chandra Shekhar Paatni on 22/7/19
 */
public class ArraySortedAndOrdered {
    public static void main(String[] args) {
        System.out.println(checkRotatedAndSorted(new int[]{30, 20, 10, 50, 35}, 5));
    }
    public static boolean checkRotatedAndSorted(int arr[], int num){

        int minEle = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < num; i++) {
            if (arr[i] < minEle) {
                minEle = arr[i];
                minIndex = i;
            }
        }


        if (minIndex == 0)
            return false;

        Boolean isFlag = true;
        for (int i = 1; i < minIndex-1; i++) {
            if (arr[i]  < arr[i - 1]) {
                isFlag = false;
                break;
            }
        }

        Boolean isFlag2 = true;
        for (int i = minIndex+1; i < num; i++) {
            if (arr[i] < arr[i-1]){
                isFlag2 = false;
                break;
            }
        }


        if (isFlag && isFlag2 && (arr[num-1] < arr[minIndex -1]))
            return true;
        else
            return false;
    }

}
