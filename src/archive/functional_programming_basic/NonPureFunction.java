package archive.functional_programming_basic;

public class NonPureFunction {
    private int count = 5;

    private  int sum(int a, int b) {
        count+=a;
        return a+b;
    }

    public static void main(String[] args) {
        NonPureFunction nonPureFunction = new NonPureFunction();
        System.out.println(nonPureFunction.sum(6 , 9));
    }
}
