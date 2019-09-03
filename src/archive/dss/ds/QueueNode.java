package archive.dss.ds;

/**
 * @author Chandra Shekhar Paatni on 12/5/19
 */
public class QueueNode<T> {
    private T data;
    private QueueNode next;

    public QueueNode(T data, QueueNode next) {
        this.data = data;
        this.next = next;
    }

    public QueueNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}
