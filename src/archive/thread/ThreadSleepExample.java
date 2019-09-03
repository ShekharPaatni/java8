package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 27/5/19
 */
public class ThreadSleepExample extends Thread{
    static int temp = 0;
    private String ex;

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        try {
            printCurrency();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static synchronized void printCurrency() throws InterruptedException {
        while (++temp <= 10) {
            Thread.yield();
            Thread.sleep(2000);
            System.out.println(temp + " "+ Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadSleepExample threadSleepExample = new ThreadSleepExample();
        ThreadSleepExample threadSleepExample1 =  new ThreadSleepExample();
        threadSleepExample.start();
        threadSleepExample1.start();

    }

}
