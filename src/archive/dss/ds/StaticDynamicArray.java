package archive.dss.ds;

import java.util.Objects;

/**
 * @author Chandra Shekhar Paatni on 7/5/19
 */
public class StaticDynamicArray<T> {

    private T[] data;

    private int DEFAULT_INITIAL_CAPACITY = 10;

    private int actSize = -1;

    public StaticDynamicArray() {
        data = (T[])new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public StaticDynamicArray(int initialCapacity) {
        this.data = (T[])new Object[initialCapacity];
    }

    public T get(int index) {
        checkIndex(index);
        return data[index];
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (Objects.nonNull(data))
                count++;
        }
        return count;
    }

    public void delete(int index) {
        checkIndex(index);
        for (int i = index; i <= actSize; i++) {
            data[i] = data[i+1];
        }
        actSize--;
    }

    public void addAll(T[] datas) {
        for (int i = 0; i < datas.length; i++) {
            add(datas[i]);
        }
    }

    public void add(T data) {
        if (actSize > ((getSize()-1) / 2) )
            increaseCapacity();
        this.data[++actSize] = data;
    }

    public void printAll() {
        for (int i = 0; i <= actSize; i++) {
            System.out.println(data[i]);
        }
    }
    private void checkIndex(int index) {
        if (index >  actSize)
            throw new IndexOutOfBoundsException("Array is out of bound");
        if (actSize < 0)
            throw new IndexOutOfBoundsException("Array is underflow");
    }
    private void increaseCapacity() {
        data = copyOf(data, data.length*2);
        System.out.println("New Capacity "+ data.length);
    }

    private T[] copyOf(T[] data, int newLength) {
        T[] newData = (T[])new Object[newLength];
        for (int i = 0; i <= actSize; i++) {
            newData[i] = data[i];
        }
        return newData;
    }

    private int getSize() {
        return data.length;
    }
    public static void main(String[] args) {
        StaticDynamicArray<Integer> integerStaticDynamicArray = new StaticDynamicArray<Integer>(2);
        integerStaticDynamicArray.add(10);
        integerStaticDynamicArray.add(20);
        integerStaticDynamicArray.add(20);
        integerStaticDynamicArray.add(20);
        integerStaticDynamicArray.add(30);
//        integerStaticDynamicArray.printAll();
        integerStaticDynamicArray.delete(0);
        System.out.println("Delete element");
//        integerStaticDynamicArray.printAll();

        integerStaticDynamicArray.addAll(new Integer[]{10,12, 15});
        integerStaticDynamicArray.printAll();
    }
}
