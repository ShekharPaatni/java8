package archive;

public class Annoymous {
    public static void main(String[] args) throws InterruptedException {
       new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Fire ");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Fire ");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Fire ");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Fire ");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Fire ");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Fire ");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Fire ");
            }
        }).start();
    Thread.sleep(500);
    }
}
