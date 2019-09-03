package archive;

@FunctionalInterface
interface Compute {
  Calculation printMe(String s);


}
public class Calculation {
    private String name;
    public Calculation() {
    }

    public Calculation(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Compute compute = Calculation::new;
        compute.printMe("shekhar");

    }

}
