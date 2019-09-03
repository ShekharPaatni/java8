package archive;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class CustomArrayList<T> {
    private final int INITIAL_DEFAULT_SIZE = 10;
    private Entry<T>[] entries;
    private int index;
    public CustomArrayList(Entry<T>[] entries) {
        this.entries = entries;
    }

    public CustomArrayList() {
        entries = new Entry[INITIAL_DEFAULT_SIZE];
    }

    public void add(T value) {
        if (index > (getSize()/2))
            increaseCapacity();
        entries[index++] = new Entry<T>().setData(value);
    }

    public T get(int index) {
        if (index > this.index)
            throw new IllegalArgumentException("Underflow");
        return entries[index].getData();
    }

    public int getSize() {
        return entries.length;
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < entries.length; i++) {
            if (Objects.nonNull(entries[i]))
                count++;
        }
        return count;
    }

    private void increaseCapacity() {
        entries = Arrays.copyOf(entries, getSize()*2);
        System.out.println("new capacity set "+ entries.length);
    }
}
