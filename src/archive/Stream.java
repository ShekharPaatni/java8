package archive;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,15,3,5,4);
        System.out.println(integerList.stream().reduce(5    , (a,b)-> a+b));
    }
}
