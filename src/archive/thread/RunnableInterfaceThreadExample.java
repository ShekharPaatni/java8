package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 27/5/19
 */
public class RunnableInterfaceThreadExample implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable interface archive.thread is working");
    }

    public static void main(String[] args) {
        new Thread(new RunnableInterfaceThreadExample()).start();
    }
}
