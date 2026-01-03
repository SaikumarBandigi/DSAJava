package LinkedListTut;

class Node {
    int data;      // The data part
    Node  next;     // The pointer to the next node

    // Constructor to initialize a node
    Node(int data) {
        this.data = data;
        this.next = null; // Initially, the next node is null
    }
}


public class LinkedListCustom {
    Node head; // The head node of the linked list

    // Method to insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, the new node becomes the head
        } else {
            Node temp = head;
            while (temp.next != null) { // Traverse to the last node
                temp = temp.next;
            }
            temp.next = newNode; // Link the last node to the new node
        }
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        if (head.data == value) {
            head = head.next; // If the head needs to be deleted
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value not found in the list.");
        } else {
            temp.next = temp.next.next; // Skip the node to be deleted
        }
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next; // save next
            curr.next = prev;      // reverse link
            prev = curr;           // move prev
            curr = next;           // move curr
        }
        head = prev;
    }

    public static void main(String[] args) {
        // Singly Linked List
        LinkedListCustom list = new LinkedListCustom();

        // Insert elements into the linked list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.reverse();
        list.display();

    }
}
/*


A linked list is a linear data structure in which elements, called nodes,
 are linked together in a sequential manner. Each node consists of two parts:

Data: The value or the content stored in the node.
Pointer (next): A reference to the next node in the sequence.
Unlike arrays, the size of a linked list is not fixed, and the elements are not stored in
 contiguous memory locations. This makes insertion and deletion operations more efficient compared to arrays.

Types of Linked Lists

Singly Linked List: Each node points to the next node, and the last node points to null.
Doubly Linked List: Each node contains a reference to both the next and previous nodes.
Circular Linked List: The last node points back to the first node, forming a circle.

 */