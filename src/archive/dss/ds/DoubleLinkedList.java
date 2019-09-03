package archive.dss.ds;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

/**
 * @author Chandra Shekhar Paatni on 8/5/19
 */
public class DoubleLinkedList<T> implements Iterable {
    private DoublyNode<T> doublyNode;
    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private Integer size = 0;
    public DoublyNode<T> getDoublyNode() {
        return doublyNode;
    }

    public void setDoublyNode(DoublyNode<T> doublyNode) {
        this.doublyNode = doublyNode;
    }

    public DoublyNode<T> getHead() {
        return head;
    }

    public void setHead(DoublyNode<T> head) {
        this.head = head;
    }

    public DoublyNode<T> getTail() {
        return tail;
    }

    public void setTail(DoublyNode<T> tail) {
        this.tail = tail;
    }
    public void add(DoublyNode doublyNode) {
        if (Objects.isNull(doublyNode))
            throw new NullPointerException();
        if (Objects.isNull(head))
            head = tail = doublyNode;
        else {
            tail.setNext(doublyNode);
            tail = doublyNode.setPrevious(tail);
        }
        size++;
    }

    public void clear() {
        DoublyNode start = head;
        while (Objects.nonNull(start)) {
            DoublyNode next = start.getNext();
            start.setNext(null).setPrevious(null).setData(null);
            start = next;
        }
        tail = head = doublyNode  = null;
        size = null;

    }

    public void addLast(DoublyNode doublyNode) {
        if (Objects.isNull(head)) {
            head = tail = doublyNode;
            return;
        }
        size++;
        tail.setNext(doublyNode);
        tail = doublyNode.setPrevious(tail);

    }

    public T peekFirst() {
        if (Objects.isNull(head))
            throw new RuntimeException();
        return head.getData();
    }

    public T peekLast() {
        if (Objects.isNull(tail))
            throw new RuntimeException();
        return tail.getData();
    }
    public boolean isEmpty() {
        return (size == 0);
    }

    public int getSize() {
        return size;
    }

    public void removeFirst() {
        if (Objects.isNull(head))
            throw new RuntimeException();
        DoublyNode current = head.getNext();
        current.setPrevious(null);
        head.setPrevious(null).setNext(null).setData(null);
        head = null;
        head = current;
        --size;
    }

    public void removeLast() {
        if (size < 0)
            throw new RuntimeException();
        if (head == tail || size == 0) {
            head.setData(null).setNext(null).setPrevious(null);
            head = tail = null;
        }
        DoublyNode current = tail.getPrevious();
        tail.setPrevious(null).setNext(null).setData(null);
        tail = null;
        tail = current;
        --size;
    }

    public void removeAt(int index) {
        int i = 0;
        if (Objects.isNull(head) || index > size)
            throw new IllegalArgumentException();
        DoublyNode current = head;
        while (Objects.nonNull(current)) {
            if (i == index) {

            }
            i++;
        }
    }

    @Override
    public Iterator iterator() {
        return new ListIterator() {
            DoublyNode doublyNode = head;
            int index = -1;
            @Override
            public boolean hasNext() {
                return Objects.nonNull(doublyNode);
            }

            @Override
            public Object next() {
                DoublyNode doublyNode1 = doublyNode.getNext();
                doublyNode = doublyNode1;
                ++index;
                return doublyNode1.getData();
            }

            @Override
            public boolean hasPrevious() {
               return Objects.nonNull(doublyNode);
            }

            @Override
            public Object previous() {
                if (doublyNode == head)
                    return head.getData();
                DoublyNode doublyNode1 = doublyNode.getPrevious();
                doublyNode = doublyNode1;
                return doublyNode1.getData();
            }

            @Override
            public int nextIndex() {
                return index+1;
            }

            @Override
            public int previousIndex() {
                return index == -1 ? 0  : index-1;
            }

            @Override
            public void remove() {
                DoublyNode previousNode = doublyNode.getPrevious();
                DoublyNode nextNode = doublyNode.getNext();
                previousNode.setNext(nextNode);
                nextNode.setPrevious(previousNode);
            }

            @Override
            public void set(Object o) {
                doublyNode.setData(o);
            }

            @Override
            public void add(Object o) {
                DoublyNode doublyNode1 = (DoublyNode)o;
                doublyNode1.setNext(doublyNode.getNext());
                doublyNode1.setPrevious(doublyNode);
                doublyNode1.getNext().setPrevious(doublyNode1);
                doublyNode1.getPrevious().setNext(doublyNode1);

            }
        };
    }
}
