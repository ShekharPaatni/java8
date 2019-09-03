package archive;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Chandra Shekhar Paatni on 3/7/19
 */
public class KeypadTyping {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = "";
            s = sc.next();
            keypadTyping(s);
            System.out.println();
        }
    }
    static public  void keypadTyping(String str) {
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a' : case 'A':
                case 'b' : case 'B' :
                case 'c' : case 'C' :{
                    System.out.print(2);
                    break;
                }

                case 'd' : case 'D' :
                case 'e' : case 'E' :
                case 'f' : case 'F' :{
                    System.out.print(3);
                    break;
                }
                case 'g' : case 'G': case 'h' : case 'H': case 'i' : case 'I':{
                    System.out.print(4);
                    break;
                }
                case 'j' : case 'J': case 'k': case 'K': case 'l': case 'L': {
                    System.out.print(5);
                    break;
                }
                case 'm': case 'M': case 'n': case 'N': case 'o': case 'O': {
                    System.out.print(6);
                    break;
                }
                case 'p' : case 'P': case 'q': case 'Q': case 'r': case 'R': case 's': case 'S': {
                    System.out.print(7);
                    break;
                }
                case 't' : case 'u': case 'v' : case 'T': case 'U': case 'V': {
                    System.out.print(8);
                    break;
                }
                case 'w': case 'x': case 'y': case 'z': case 'W': case 'X': case 'Y': case 'Z': {
                    System.out.print(9);
                    break;
                }

            }
        }
    }
}
