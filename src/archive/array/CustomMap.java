package archive.array;

import java.util.Objects;

/**
 * @author Chandra Shekhar Paatni on 5/5/19
 */
public class CustomMap<K, V> {

    private final int BUCKET_SIZE = 10;
    private Entry<K, V>[] bucket;

    public CustomMap() {
        this.bucket = new Entry[BUCKET_SIZE];
    }

    public CustomMap(Entry<K, V>[] capacity) {
        this.bucket = capacity;
    }

    private void throwIfKeyNull(K key) {
        if (Objects.isNull(key))
            throw new IllegalArgumentException("Key may not be null");
    }

    private int bucketIndexForkey(K key) {
        return key.hashCode() % bucket.length;
    }

    public V get(K key) {
        throwIfKeyNull(key);
        Entry<K, V> kvEntry = bucket[bucketIndexForkey(key)];
        while (Objects.isNull(kvEntry) && !key.equals(kvEntry.getKey()))
            kvEntry = kvEntry.getNext();
        return Objects.nonNull(kvEntry) ? kvEntry.getValue() : null;
    }

    public void put(K key, V value) {
        throwIfKeyNull(key);
        int bucketIndex = bucketIndexForkey(key);
        Entry<K, V> entry = bucket[bucketIndex];
        Boolean done;
        if (Objects.nonNull(entry)) {
            done = false;
            while (!done) {
                if (key.equals(entry.getKey())) {
                    entry.setValue(value);
                    done = true;
                } else if (Objects.isNull(entry.getNext())) {
                    entry.setNext(new Entry<K, V>(key, value));
                    done = true;
                }
            }
        } else {
            bucket[bucketIndex] = new Entry<>(key, value);
        }
    }

    public void print() {
        for (int i = 0; i < bucket.length; i++) {
            if (Objects.nonNull(bucket[i])) {
                System.out.println("Key : " + bucket[i].getKey() + " Value : " + bucket[i].getValue());
                Entry entry = bucket[i].getNext();
                while (Objects.nonNull(entry)) {
                    System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
                    entry = entry.getNext();
                }
            }
        }
    }
}
