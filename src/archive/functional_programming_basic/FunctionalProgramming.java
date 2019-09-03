package archive.functional_programming_basic;
@FunctionalInterface
interface Compute {
    void printMe(String s);
}
public class FunctionalProgramming {

    public static Compute printMe() {

        return s1 ->  System.out.println(s1);

    }

    public static void main(String[] args) {
        printMe().printMe("Shekhar");
        String s = "Hello";
        String s1 = new String("Hello");
        System.out.println(s == s1);
    }
}
