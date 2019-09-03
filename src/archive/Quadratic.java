package archive;

/**
 * @author Chandra Shekhar Paatni on 17/6/19
 */
public class Quadratic {
    public static void main(String[] args) {
        quadraticRoots(752, 904, 164);
    }

    public static void quadraticRoots(int a,int b,int c)
    {
        int firstroot = (int)Math.floor((-b + (Math.sqrt((b*b) - (4*a*c)))) / (2*a));
        int secondroot = (int)Math.floor((-b - (Math.sqrt((b*b) - (4*a*c)))) / (2*a));
        System.out.print(firstroot +" "+ secondroot);
    }

}
