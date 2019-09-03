package archive.dss.ds;

/**
 * @author Chandra Shekhar Paatni on 8/5/19
 */
public class CustomStack<T> {
    private int top = -1;
    private static int INITIAL_DEFAULT_SIZE = 10;
    private T[] data;

    public CustomStack(int initialCapacity) {
        data = (T[]) new Object[initialCapacity];
    }

    public CustomStack() {
        data = (T[]) new Object[INITIAL_DEFAULT_SIZE];
    }


    public void push(T data) {
        if (top > this.data.length)
            this.data = copyOf(this.data, this.data.length*2);
        this.data[++top] = data;
    }

    public T pop() {
        if (top < 0)
            throw new ArrayIndexOutOfBoundsException();
        return this.data[top--];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top < 0;
    }
    private T[] copyOf(T[] data, int newLength) {
        T[] newData = (T[]) new Object[newLength];
        for (int i = 0; i < top; i++) {
            newData[i] = data[i];
        }
        return newData;
    }

    public static void main(String[] args) {
        CustomStack<Integer> customStack = new CustomStack<>();
        customStack.push(10);
        customStack.push(12);
        customStack.push(15);
        System.out.println(customStack.pop());
        System.out.println("*************************");
        int size = customStack.size();
        while (size >= 0) {
            System.out.println(customStack.pop());
            size--;
        }
        System.out.println(customStack.isEmpty());
    }
}