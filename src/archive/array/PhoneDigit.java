package archive.array;

/**
 * @author Chandra Shekhar Paatni on 21/6/19
 */
public class PhoneDigit {
   private static final  String[] STRINGS = new String[] {
           "", "", "ABC", "DEF",
           "GHI", "JKL", "MNO",
           "PQRS", "TUV", "WXYZ", ""
   };

    public static void main(String[] args) {
        possible(new int[]{2, 3, 4}, 3);
    }

    private static void possible(int[] arr, int N) {
        if (N >=1 && N <= 10) {
            String[] numberToStrings = findStringFromNumber(arr);
            possibleWords(numberToStrings, "", 0, 0, N);
        }
    }

    private static void possibleWords(String[] string, String currString, int startIndex, int index, int endIndex) {
       if (string.length ==  endIndex) {
           if (!currString.isEmpty())
             System.out.println(currString);
           return;
       }

       possibleWords(string, currString, startIndex+1, index+1, endIndex);
       possibleWords(string, currString+ string[startIndex].charAt(index), startIndex+1, index+1, endIndex);
       possibleWords(string, currString+ string[startIndex].charAt(index), startIndex+1, index+1, endIndex);
    }


    private static String[] findStringFromNumber(int[] arr) {
        String[] strings = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strings[i] = STRINGS[arr[i]];
        }
        return strings;
    }
}
