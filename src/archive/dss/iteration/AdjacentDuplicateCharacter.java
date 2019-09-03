package archive.dss.iteration;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class AdjacentDuplicateCharacter {
    public static void main(String[] args) {
        String input = "AABBBCCDD";
        removeDuplicateAdjacentCharacter(input);
    }

    public static void removeDuplicateAdjacentCharacter(String input) {
        String temp = "";
        if (input.isEmpty())
            return;
        for (int i = 0; i < input.length(); i++) {
            if (temp.isEmpty())
                temp += input.charAt(i);
            if (temp.charAt(temp.length()-1) != input.charAt(i))
                temp += input.charAt(i);
        }
        System.out.println(temp);
    }
}
