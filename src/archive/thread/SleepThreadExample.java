package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 27/5/19
 */
public class SleepThreadExample extends Thread{
    public SleepThreadExample() {
    }

    public SleepThreadExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SleepThreadExample sleepThreadExample = new SleepThreadExample("First Thread");
        SleepThreadExample sleepThreadExample1 = new SleepThreadExample("Second Thread");
        SleepThreadExample sleepThreadExample2 = new SleepThreadExample("Third Thread");

        sleepThreadExample.start();
        sleepThreadExample1.start();
        sleepThreadExample2.start();
    }
}
