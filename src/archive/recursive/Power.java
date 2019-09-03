package archive.recursive;

/**
 * @author Chandra Shekhar Paatni on 19/6/19
 */
class Power
{
    public static void main(String[] args) {
        System.out.println(RecursivePower(2, 9));
    }
    static int RecursivePower(int n,int p)
    {
        if (p < 1)
            return 1;

        return n * RecursivePower(n, p-1);
    }

}
