package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 27/5/19
 */
public class Example1  extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Example1().start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("***************************************");
        for (int i = 0; i < 8; i++) {
            new Example1().start();
        }
    }
}
