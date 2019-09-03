package archive;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class Entry<T> {
    private T data;

    public T getData() {
        return data;
    }

    public Entry<T> setData(T data) {
        this.data = data;
        return this;
    }
}
