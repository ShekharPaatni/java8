package archive.functional_programming_basic;

public class HeadRecursion {
    public static int factorial(int n) {
        if (n == 1)
            return n;
        else
            return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int tailFactorial(int factorialNumber, int factorialValue) {
        return (factorialNumber == 1) ?
                factorialValue :
                tailFactorial(factorialNumber-1, factorialValue*factorialNumber);
    }
}
