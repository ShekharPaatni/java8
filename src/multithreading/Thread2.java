package multithreading;

/**
 * @author Chandra Shekhar Paatni on 2/9/19
 */

public class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello");
    }
}

class App1 {
    public static void main(String[] args) {
        new Thread(new Thread2()).start();
    }
}
