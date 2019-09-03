package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 27/5/19
 */
public class Exercise1  implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i %10 != 0)
                System.out.println(i+ "  "+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        Thread thread = new Thread(new Exercise1());
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
    }
}
