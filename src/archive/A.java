package archive;

/**
 * @author Chandra Shekhar Paatni on 8/8/19
 */
public class A {
    void printMe(String m) {
        System.out.println(m);
    }
    void printMe(Integer n) {
        System.out.println(n);
    }
    void printMe(Object n) {
        System.out.println(n);
    }

    public static void main(String[] args) {
        new A().printMe("");
    }
}
