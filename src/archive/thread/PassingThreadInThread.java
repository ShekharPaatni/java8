package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 27/5/19
 */
public class PassingThreadInThread {
    public static void main(String[] args) {
        ExtendingThreadExample extendingThreadExample = new ExtendingThreadExample();
        new ExtendingThreadExample(extendingThreadExample).start();
    }
}
