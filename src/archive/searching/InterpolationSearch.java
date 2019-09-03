package archive.searching;

/**
 * @author Chandra Shekhar Paatni on 22/5/19
 */
public class InterpolationSearch {
    static int[] arr = {1,2,4,5,6,7,8,9,10,11,12};

    public static void main(String[] args) {
        int index = interpolationSearch(0, arr.length-1, 11);
        System.out.println(index);
    }

    public static int interpolationSearch(int low, int high, int elementSearch) {
       while (low <= high && elementSearch >=arr[low] && elementSearch <= arr[high]) {
           if (low == high)
               if (arr[low] == elementSearch)
                   return low;
               else
                   return -1;

           int pos = (int) (low + (((double)(high - low) /
                              (arr[high] - arr[low])) * (elementSearch - arr[low])));

           if (arr[pos] == elementSearch)
               return pos;
           if (arr[pos] < elementSearch)
               low = pos+1;
           if (arr[pos] > elementSearch) {
               high = pos-1;
           }
       }
       return -1;
    }
}
