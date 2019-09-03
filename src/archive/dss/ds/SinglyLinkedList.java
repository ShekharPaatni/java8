package archive.dss.ds;

import java.util.Iterator;
import java.util.Objects;

/**
 * @author Chandra Shekhar Paatni on 8/5/19
 */
public class SinglyLinkedList<T> implements Iterable{
    private Node<T> node;

    private static Node head;

    private static Node tail;


    public SinglyLinkedList() {
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }

    public void add(Node<T> node) {
        if (head == null) {
            head = tail = node;
        } else {
            tail = tail.setNext(node).getNext();
        }
    }

    public Node<T> get(int index) {
        if (head == null || tail == null) {
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        Node top = head;
        while (Objects.nonNull(top)) {
            if (count == index)
                return top;
            top = top.getNext();
            count++;
        }
        if (index > count)
            throw new IndexOutOfBoundsException();
        return null;
    }

    public void addAll(SinglyLinkedList<T> singlyLinkedList) {
        Node node = singlyLinkedList.getNode();
        while (Objects.nonNull(node)) {
            add(node);
            node = node.getNext();
        }
        System.out.println("Successfully Added collection of node");
    }

    public void insertBefore(int index, Node node) {
        Node top = head;
        int count = 0;
        if (index < 0)
            throw new IndexOutOfBoundsException();
        if (index == 0)
            addFirst(node);
        Boolean isInserted = false;
        while (Objects.nonNull(top)) {
            if (count == index-1) {
                Node node1 = top.getNext();
                top.setNext(node);
                node.setNext(node1);
                isInserted = true;
            }
            count++;
            top = top.getNext();
        }
        if (!isInserted && index ==  count)
            addLast(node);

    }

    public void addLast(Node node) {
        if (Objects.isNull(node))
            throw new NullPointerException();
        tail = tail.setNext(node).getNext();
    }

    public void addFirst(Node node) {
        if (Objects.isNull(node))
            throw new NullPointerException();
        head =node.setNext(head);
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> integerSinglyLinkedList =  new SinglyLinkedList<>();
        integerSinglyLinkedList.add(new Node<>(10));
        integerSinglyLinkedList.add(new Node<>(12));
        integerSinglyLinkedList.add(new Node<>(13));

        integerSinglyLinkedList.insertBefore(1, new Node(18));

        Iterator iterator = integerSinglyLinkedList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            Node<T> current = head;
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

