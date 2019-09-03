package archive.functional_programming_basic;

public class PureFunction {
    private int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        PureFunction pureFunction = new PureFunction();
        System.out.println(pureFunction.sum(10, 8));
    }
}
