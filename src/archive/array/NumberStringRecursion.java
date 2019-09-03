package archive.array;

/**
 * @author Chandra Shekhar Paatni on 21/6/19
 */
public class NumberStringRecursion {

    public static void main(String[] args) {
        possibleWords(new int[]{2 ,3 ,4}, 3);
    }
    static void possibleWords(int a[], int N)
        {
            String[] strings = new String[] {
                    "", "", "ABC", "DEF",
                    "GHI", "JKL", "MNO",
                    "PQRS", "TUV", "WXYZ", ""
            };

            String string = "";
            for (int i = 0; i < a.length; i++) {
                string +=(strings[a[i]]);
            }

            possibleWordsUsingNumberAlpha(string, "", 0);
        }

        static void possibleWordsUsingNumberAlpha (String string, String currentString, int index) {
            if (index == string.length()) {
                System.out.println(currentString);
                return;
            }
            possibleWordsUsingNumberAlpha(string, currentString, index+1);
            possibleWordsUsingNumberAlpha(string, currentString + string.charAt(index), index+1);
        }
}
