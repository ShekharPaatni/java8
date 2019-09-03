package archive.thread;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Chandra Shekhar Paatni on 28/5/19
 */

class NameList {
    private List names = Collections.synchronizedList(new LinkedList<>());

    public void add(String name) {
        names.add(name);
    }

    private String removeFirst() {
        if (names.size() > 0)
            return names.remove(0).toString();
        else
            return null;
    }

    public static void main(String[] args) {

        final NameList list = new NameList();
        list.add("Shekhar");
        list.add("Nidhi");
        list.add("Kavita");
        class NameDropper extends Thread{
            @Override
            public void run() {
                System.out.println(list.removeFirst());
            }
        }

        new NameDropper().start();
        new NameDropper().start();
        new NameDropper().start();
        new NameDropper().start();
    }
}
