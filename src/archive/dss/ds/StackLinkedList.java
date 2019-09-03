package archive.dss.ds;

import java.util.Iterator;
import java.util.Objects;

/**
 * @author Chandra Shekhar Paatni on 8/5/19
 */
public class StackLinkedList<T> implements Iterable {
    private Node<T> node;
    private Node<T> head;

    private int size = -1;

    public void push(Node<T> data) {
        if (Objects.isNull(head))
            head = node = data;
        else {
            data.setNext(head);
            head = data;
        }
        ++size;
    }

    public T pop() {
        if (Objects.isNull(head))
            throw new IllegalArgumentException();
        Node node = head;
        head = head.getNext();
        --size;
        return (T)node.getData();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        StackLinkedList<Integer> integerStackLinkedList = new StackLinkedList<>();
        integerStackLinkedList.push(new Node<>(10));
        integerStackLinkedList.push(new Node<>(12));

        Iterator iterator = integerStackLinkedList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        integerStackLinkedList.pop();
        Iterator iterator1 = integerStackLinkedList.iterator();

        System.out.println("**************************");
        while (iterator1.hasNext())
            System.out.println(iterator1.next());

    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            Node current = head;
            @Override
            public boolean hasNext() {
                return Objects.nonNull(current);
            }

            @Override
            public Object next() {
                Node node = current;
                current = current.getNext();
                return node.getData();
            }
        };
    }
}
