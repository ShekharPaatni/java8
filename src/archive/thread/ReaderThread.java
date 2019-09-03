package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 28/5/19
 */
public class ReaderThread extends Thread {
    private Calculation calculation;

    public ReaderThread(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public void run() {
        synchronized (calculation) {
            try {
                System.out.println("Waiting for calculation");
                calculation.wait();
            } catch (InterruptedException e) {
                System.out.println("Total is: "+ calculation.total);
            }
        }
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        new ReaderThread(calculation).start();
        new ReaderThread(calculation).start();
        new ReaderThread(calculation).start();
        System.out.println(calculation.total);
    }
}

class Calculation implements Runnable {
     int total;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("*****yaha aaya kya************");
            for (int i = 0; i < 100; i++) {
                this.total+=i;
            }
            notifyAll();
        }
    }
}
