package archive;

/**
 * @author Chandra Shekhar Paatni on 12/7/19
 */
public class PossibleWords {
   static String[] mobileAlphaWords = {"0", "1",  "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
    public static void main(String[] args) {
        possibleWords(new int[]{}, 3);
    }

    static void possibleWords(int[] a, int N) {
        possibleWordsWithMobile(new int[]{2, 3, 4}, "", 0);
    }

    static void possibleWordsWithMobile(int[] a, String partialString, int index) {
        if (index == a.length) {
            System.out.println(partialString.toLowerCase());
            return;
        }

        for (int i = 0; i < mobileAlphaWords[a[index]].length(); i++) {
            partialString += mobileAlphaWords[a[index]].charAt(i);
            possibleWordsWithMobile(a, partialString, index+1);
            partialString = partialString.substring(0, index);
        }
    }
}
