package archive;

/**
 * @author Chandra Shekhar Paatni on 13/7/19
 */
public class SortedRotated {

    public static void main(String[] args) {
        Boolean isAsc = isAscending(new int[] {30, 20, 10, 50, 35});
        if(isAsc) {

        } else {

        }
    }

    public static boolean isAscending(int num[]) {
        return num[0] >= num[num.length-1];
    }

    public static boolean isRotate(int[] num, boolean isAscending) {
        int low = 0, high = num.length-1;
        boolean isRotate = true;
        while (low <= high) {
           if(isAscending) {

           } else  {

           }
        }
        return isRotate;
    }
}
