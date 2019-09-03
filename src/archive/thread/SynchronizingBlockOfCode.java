package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 28/5/19
 */
public class SynchronizingBlockOfCode extends Thread{

    private StringBuffer stringBuffer ;

    public SynchronizingBlockOfCode(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    public SynchronizingBlockOfCode() {
    }

    public StringBuffer getStringBuffer() {
        return stringBuffer;
    }

    public void setStringBuffer(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println(stringBuffer);
            }
            int i = ((int) stringBuffer.charAt(0));
            stringBuffer.replace(0 ,1, String.valueOf((char)++i));
            System.out.println(stringBuffer);
        }
    }

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("archive.A");
        new SynchronizingBlockOfCode(stringBuffer).start();
        new SynchronizingBlockOfCode(stringBuffer).start();
        new SynchronizingBlockOfCode(stringBuffer).start();

    }
}
