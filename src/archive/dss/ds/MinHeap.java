package archive.dss.ds;

/**
 * @author Chandra Shekhar Paatni on 11/5/19
 */
public class MinHeap extends HeapHelper {
    private static final Integer INITIAL_DEFAULT_SIZE  = 10;

    public MinHeap() {
        this.items = new int[INITIAL_DEFAULT_SIZE];
    }

    public MinHeap(int capacity) {
        this.items = new int[capacity];
    }

}
