package archive.dss.ds;

/**
 * @author Chandra Shekhar Paatni on 8/5/19
 */
public class DoublyNode<T> {
    private DoublyNode<T> previous;
    private T data;
    private DoublyNode<T> next;

    public DoublyNode() {
    }

    public DoublyNode(T data) {
        this.data = data;
    }

    public DoublyNode<T> getPrevious() {
        return previous;
    }

    public DoublyNode<T> setPrevious(DoublyNode<T> previous) {
        this.previous = previous;
        return this;
    }

    public T getData() {
        return data;
    }

    public DoublyNode<T> setData(T data) {
        this.data = data;
        return this;
    }

    public DoublyNode<T> getNext() {
        return next;
    }

    public DoublyNode<T> setNext(DoublyNode<T> next) {
        this.next = next;
        return this;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
