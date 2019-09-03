package archive.array;

/**
 * @author Chandra Shekhar Paatni on 21/6/19
 */
public class StringRecursion {
    public static void main(String[] args) {
        possibleStrings("ABC", "", 0);
    }

    private static void possibleStrings(String string, String currentString, int index) {
        if (index == string.length()) {
            System.out.println(currentString);
            return;
        }
        possibleStrings(string, currentString, index+1);
        possibleStrings(string, currentString + string.charAt(index), index+1);
    }

}
