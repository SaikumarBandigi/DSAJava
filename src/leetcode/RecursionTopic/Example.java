package leetcode.RecursionTopic;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head; // first node

    // Add element at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            // Traverse till last node
            while (current.next != null) {
                current = current.next;
            }

            // Link new node at end
            current.next = newNode;
        }

    }

    // Optional: display list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


public class Example {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.display();

    }
}
