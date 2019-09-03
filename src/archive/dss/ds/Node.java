package archive.dss.ds;

/**
 * @author Chandra Shekhar Paatni on 8/5/19
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public Node() {
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> setNext(Node<T> next) {
        this.next = next;
        return this;
    }

    public Node<T> setData(T data) {
        this.data = data;
        return this;
    }
}
