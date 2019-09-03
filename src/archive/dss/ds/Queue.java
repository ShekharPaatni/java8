package archive.dss.ds;

import java.util.Objects;

/**
 * @author Chandra Shekhar Paatni on 9/5/19
 */
public class Queue<T> {
    private Node<T> node;
    private Node<T> front;
    private Node<T> last;
    private int size;

    public void enQueue(Node<T> data) {
        if (front == null)
            front = last = data;
        else {
            last.setNext(data);
            last = data;
        }
        size++;
    }

    public T deQueue() {
        if (front == null || last == null)
            throw new IllegalArgumentException();
        Node node = front;
        front = node.getNext();
        size--;
        return (T)node.getData();
    }

    public T peek() {
        if (front == null)
            throw new IllegalArgumentException();
        return (T) front.getData();
    }

    public boolean contains(T data) {
        Node node = front;
        while (Objects.nonNull(node)) {
            if (node.getData().equals(data))
                return true;
            node = node.getNext();
        }
        return false;
    }

    public void removal(T data) {
        Node node = front;
        while (node !=null) {
            if (node.getNext().getData().equals(data)) {
                node.getNext().setNext(node.getNext().getNext());
            }
        }
    }

    public boolean isEmpty() {
        return front == last;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue();
        queue.enQueue(new Node<>(10));
        queue.enQueue(new Node<>(15));
        queue.enQueue(new Node<>(14));
        queue.enQueue(new Node<>(13));
        System.out.println(queue.deQueue());
    }
}
