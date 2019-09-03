package archive;

import java.util.Arrays;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Shekhar", "Pooja");
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        int var = 10;
// This line will generate error
// because we are changing a variable before using it inside lambda expression
        integerList.forEach(e -> System.out.println(var));
    }
    }
