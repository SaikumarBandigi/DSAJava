package practisetut;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList {
    private Node head;

    // Add node at end
    public void add(int data) {
        Node newNode = new Node(data);

        // if list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // traverse to last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // link new node
        temp.next = newNode;
    }

    // 🔁 Reverse LinkedList
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;   // store next
            curr.next = prev;   // reverse link
            prev = curr;        // move prev
            curr = next;        // move curr
        }

        head = prev; // new head
    }

    // Print list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class CustomLinkedListTut {
    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original List:");
        list.print();

        list.reverse();

        System.out.println("Reversed List:");
        list.print();

    }
}