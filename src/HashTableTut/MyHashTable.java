package HashTableTut;

import java.util.LinkedList;

public class MyHashTable<K, V> {
    private static final int SIZE = 16;  // Size of the hash table
    private LinkedList<Node<K, V>>[] table;  // Array of linked lists to handle collisions

    // Node class to store key-value pairs
    static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor to initialize the table
    public MyHashTable() {
        // Create an array of LinkedLists for each index
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to map the key to an index in the table
    private int hash(K key) {
        // Ensure the index is always non-negative and within bounds
        return Math.abs(key.hashCode()) % SIZE;
    }

    // Insert a key-value pair into the hash table
    public void insert(K key, V value) {
        int index = hash(key);
        LinkedList<Node<K, V>> bucket = table[index];

        // Check if the key already exists in the bucket
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;  // Update value if key exists
                return;
            }
        }

        // Add a new node if the key doesn't exist
        bucket.add(new Node<>(key, value));
    }

    // Delete a key-value pair from the hash table
    public void delete(K key) {
        int index = hash(key);
        LinkedList<Node<K, V>> bucket = table[index];

        // Iterate through the bucket and remove the node with the matching key
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node);  // Remove the node
                return;
            }
        }
    }

    // Search for a value by its key
    public V search(K key) {
        int index = hash(key);
        LinkedList<Node<K, V>> bucket = table[index];

        // Iterate through the bucket to find the key
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;  // Return the value if the key is found
            }
        }
        return null;  // Return null if the key is not found
    }

    // Main method for testing the MyHashTable
    public static void main(String[] args) {
        MyHashTable<String, Integer> myHashTable = new MyHashTable<>();

        // Insert some key-value pairs
        myHashTable.insert("apple", 1);
        myHashTable.insert("banana", 2);
        myHashTable.insert("cherry", 3);

        // Search for a value
        System.out.println("apple: " + myHashTable.search("apple"));  // Output: 1
        System.out.println("banana: " + myHashTable.search("banana"));  // Output: 2

        // Delete a key-value pair
        myHashTable.delete("banana");
        System.out.println("banana: " + myHashTable.search("banana"));  // Output: null
    }
}
