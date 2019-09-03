package archive;

import java.util.Scanner;

/**
 * @author Chandra Shekhar Paatni on 8/7/19
 */
public class Ones {
    // Object of archive.Arrays class to access archive.array declared in archive.Arrays class
    static Arrays obj = new Arrays();

    // Function to count number of ones in the binary archive.array
    // n: size of archive.array
    public static int countOnes(int n){
        int count = 0;
        for (int i = 0; i < Arrays.arr.length; i++) {
            if (Arrays.arr[i] == 1)
                count++;
            else
                break;
        }
        return count;
    }
}

class Arrays {
    static int arr[] = new int[5000001];

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Ones obj = new Ones();
            System.out.println(obj.countOnes(n));


        }

    }
}
