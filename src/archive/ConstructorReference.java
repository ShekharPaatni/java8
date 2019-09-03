package archive;

interface DemoInterface {
    String myMethod(char[] chars);
}

public class ConstructorReference {
    public static void main(String[] args) {
        DemoInterface demoInterface = String::new;
        String str = demoInterface.myMethod(new char[] { 'a', 'b', 'c', 'd'});
        System.out.println(str);
    }
}
