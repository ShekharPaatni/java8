package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 27/5/19
 */
public class StartingThreadExample extends Thread{
    public StartingThreadExample(String name) {
        super(name);
    }

    public StartingThreadExample() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        new StartingThreadExample("sam").start();

        new StartingThreadExample().run();
    }
}
