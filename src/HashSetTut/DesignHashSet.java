package HashSetTut;

import java.util.LinkedList;

public class DesignHashSet{
    private static final int SIZE = 769; // Prime number for better distribution
    private LinkedList<Integer>[] buckets;

    public DesignHashSet() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int index = hash(key);
        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        buckets[index].remove((Integer) key);
    }

    public boolean contains(int key) {
        int index = hash(key);
        return buckets[index].contains(key);
    }

    public static void main(String[] args) {

    }
}
