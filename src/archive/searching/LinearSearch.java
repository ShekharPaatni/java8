package archive.searching;

import java.util.Scanner;

/**
 * @author Chandra Shekhar Paatni on 21/5/19
 */
public class LinearSearch {
    int[] arr = {2,4,3,1,32,4,21,31,133,422,11};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinearSearch search = new LinearSearch();
        if (search.isSearch(scanner.nextInt()))
            System.out.println("Number match found");
        else
            System.out.println("Number doesn't match");
    }

    private boolean isSearch(int x) {
        if (x > 0) {
            for (int i : arr) {
                if (x == i)
                    return true;
            }
        }
        return false;
    }
}
