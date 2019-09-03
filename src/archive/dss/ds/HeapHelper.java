package archive.dss.ds;

import java.util.Arrays;

/**
 * @author Chandra Shekhar Paatni on 11/5/19
 */
public class HeapHelper {
    int[] items;
    private int size = 0 ;

    public int getLeftIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    public int getRightIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    public int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    public Boolean hasLeftChild(int index) {
        return getLeftIndex(index) < size;
    }

    public Boolean hasRightChild(int index) {
        return getRightIndex(index) < size;
    }

    public Boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }


    public int leftChild(int index) {
        return items[getLeftIndex(index)];
    }

    public int rightChild(int index) {
        return items[getRightIndex(index)];
    }

    public int parent(int index) {
        return items[getParentIndex(index)];
    }

    public void increaseCapacity() {
        items = Arrays.copyOf(items, items.length * 2);
        System.out.println("Increased size "+ items.length);
    }

    public int peek() {
        return items[0];
    }

    public void swap(int indexOne, int indexintwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexintwo];
        items[indexintwo] = temp;
    }

    public int poll() {
        if (size == 0)
            throw new IllegalArgumentException();
        int item = items[0];
        items[0] = items[size -1];
        size--;
        heapifyDown();
        return item;
    }

    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index))
                smallerChildIndex = getRightIndex(index);
            if (items[index] < items[smallerChildIndex])
                break;
            else
                swap(index, smallerChildIndex);

            index = smallerChildIndex;
        }
    }

    public void add(int item) {
        if (items.length / 2 < size)
            increaseCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    private void heapifyUp() {
        int index = size -1;
        while (hasParent(index) && parent(index)  > items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

}
