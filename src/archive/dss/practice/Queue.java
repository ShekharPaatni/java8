package archive.dss.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chandra Shekhar Paatni on 12/5/19
 */
public class Queue<T> {
    private final static Integer DEFAULT_CAPACITY = 10;
    List<T> queues;
    public Queue(int capacity) {
        this.queues = new ArrayList<>(capacity);
    }

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public void enQueue(T data) {
        queues.add(data);
    }

    public T deQueue() {
        if (queues.isEmpty())
            throw new IllegalArgumentException();
        return queues.remove(0);
    }

    public T peek() {
        if (queues.isEmpty())
            throw new IllegalArgumentException();
        return queues.get(0);
    }

    public boolean isEmpty(){
        return queues.isEmpty();
    }

}
