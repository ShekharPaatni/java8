package archive;

import java.util.stream.IntStream;

interface Demo {
    int sum(int a, int b);
}


public class Lambda {

    private static void summision (int a, int b, Demo demo) {
        System.out.println(demo.sum(a, b));
    }

    private static Demo getSumDefinition () {
        return new Demo() {
            @Override
            public int sum(int a, int b) {
                return a+(b*b);
            }
        };
    }
    public static void main(String[] args) {

        Demo demo = new Demo() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };

        summision(6, 8, demo);

        summision(8, 18, new Demo() {
            @Override
            public int sum(int a, int b) {
                return (a * a) + b;
            }
        });

        //Range
        IntStream integers = IntStream.rangeClosed(1, 5);
        integers.forEach(System.out::println);

    }
}
