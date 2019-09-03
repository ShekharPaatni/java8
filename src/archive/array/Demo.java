package archive.array;

/**
 * @author Chandra Shekhar Paatni on 5/5/19
 */
public class Demo {
    public static void main(String[] args) {
        CustomMap<String, Integer> customMap = new CustomMap<>();
        customMap.put("1", 1);
        customMap.put("2", 2);

        customMap.print();
    }
}
