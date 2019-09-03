package archive;

import java.util.Arrays;
import java.util.List;

public class LambdaAnnoymousDiff {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("***");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("***");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("***");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("***");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("***");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("***");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("***");
            }
        }).start();new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("***");
            }
        }).start();

    }
}
