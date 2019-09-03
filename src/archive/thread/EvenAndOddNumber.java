package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 27/5/19
 */
public class EvenAndOddNumber{
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                if (i%2 == 0)
                    System.out.println(i);
            }
        }).start();
        Thread.sleep(2000);
        System.out.println("Odd numbers");
        new Thread(() ->  {
            for (int i = 0; i < 10; i++) {
                if (i%2 != 0)
                    System.out.println(i);
            }
        }).start();
    }
}
