package archive.dss.ds;

import java.util.Iterator;
import java.util.Objects;

/**
 * @author Chandra Shekhar Paatni on 12/5/19
 */
public class CustomQueueImpl<T> implements Iterable<T>{

    private QueueNode<T>[] queueNodes;

    private QueueNode head , tail;

    private int size = -1;

    public void enQueue(T data) {
        ensureCapacity();
        QueueNode queueNode = new QueueNode(data);
        if (Objects.isNull(head)) {
            head = tail = queueNode;
        } else {
            tail.setNext(queueNode);
        }
        ++size;
    }

    public T deQueue() {
        if (isEmpty())
            throw new IllegalArgumentException();
        QueueNode queueNode = head;
        head = head.getNext();
        --size;
        return (T) queueNode.getData();
    }

    public T peek() {
        if (isEmpty())
            throw new RuntimeException();
        return (T)head.getData();
    }


    public Boolean isEmpty() {
        return size == -1 || Objects.isNull(head);
    }

    private void ensureCapacity() {
        QueueNode[] newQueueNodes;
        if (size >= queueNodes.length/2) {
            newQueueNodes = new QueueNode[queueNodes.length * 2];
            for (int i = 0; i < queueNodes.length; i++) {
                newQueueNodes[i] = queueNodes[i];
            }
            queueNodes = newQueueNodes;
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            QueueNode currentNode = head;
            @Override
            public boolean hasNext() {
                return Objects.isNull(currentNode);
            }

            @Override
            public T next() {
                QueueNode queueNode = currentNode;
                currentNode = currentNode.getNext();
                return (T) queueNode.getData();
            }
        };
    }
}
