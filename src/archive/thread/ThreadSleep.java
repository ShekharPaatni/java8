package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 27/5/19
 */
public class ThreadSleep extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " "+ Thread.currentThread().getName());

        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSleep threadSleep = new ThreadSleep();
        threadSleep.start();
        threadSleep.join(2000);
        new ThreadSleep().start();

    }
}
