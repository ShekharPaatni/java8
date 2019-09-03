package archive;

/**
 * @author Chandra Shekhar Paatni on 13/7/19
 */
public class Stock {
    public static void main(String[] args) {
        stockBuySell(new int[]{23, 13, 25, 29, 33, 19, 34, 45, 65, 67}, 7);
    }

    // Function to find the buy and sell days and print them
    static void stockBuySell(int arr[], int n) {
        int localMinima = 0, localMaxima = -1;
        for (int i = 0; i < arr.length-1; i++) {
            localMaxima++;
            if (arr[i] >= arr[i+1]) {
                if (localMaxima > localMinima)
                    System.out.print("(" + localMinima + " " + localMaxima + ") ");
                localMinima = i+1;
            }
        }
        if (arr[localMaxima] < arr[arr.length -1]) {
            System.out.print("(" + localMinima + " " + (arr.length -1) + ") ");
        }
    }


}
