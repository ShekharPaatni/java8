package multithreading;

/**
 * @author Chandra Shekhar Paatni on 2/9/19
 */

public class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello! calling from thread"+ Thread.currentThread().getName());
    }
}

class App {
    public static void main(String[] args) {
        new Thread1().start();
    }
}