package archive.dss.ds;

import java.util.Objects;

/**
 * @author Chandra Shekhar Paatni on 12/5/19
 */

public class CircularQueue<T> {
    private QueueNode<T>[] queueNodes;
    private QueueNode<T> head;
    private QueueNode<T> tail;
    private int size = -1;
    private static final Integer DEFAULT_CAPACITY = 10;

    public CircularQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CircularQueue(int capacity) {
        queueNodes = (QueueNode<T> []) new Object[capacity];
    }

    public void enQueue(T data) {
        QueueNode queueNode = new QueueNode(data);
        if (isEmpty()) {
            head = tail = queueNode;
            size++;
        }
        if (size == queueNodes.length || tail.getNext().getData().equals(head.getData())) {
            QueueNode queueNode1 = head.getNext();
            tail = queueNode;
            tail.setNext(queueNode1);
            head = queueNode1;

        } else {
            tail.setNext(queueNode);
            size++;
        }

    }

    public T deQueue() {
        if (isEmpty())
            throw new RuntimeException();
        QueueNode tempQueueNode = head;
        head = head.getNext();
        return (T)tempQueueNode.getData();
    }


    public T peek() {
        if (isEmpty())
            throw new RuntimeException();
        return head.getData();
    }

    public Boolean isFull() {
        return (!isEmpty() && tail.getNext().getData().equals(head.getData()));
    }

    public Boolean isEmpty() {
        return Objects.isNull(head);
    }
}
