package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 27/5/19
 */
public class ExtendingThreadExample extends Thread{
    public ExtendingThreadExample() {
    }

    public ExtendingThreadExample(ExtendingThreadExample extendingThreadExample) {
        super(extendingThreadExample);
    }

    @Override
    public void run() {
        System.out.println("example is working");
    }

    public static void main(String[] args) {
        new ExtendingThreadExample().start();
    }
}
