package stanley;



class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class CustomLinkedList {

    Node head;
    Node tail;   // Added tail


    public void insert(int data) {

        Node newNode = new Node(data);  //2

        // If list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // No need to traverse!
        tail.next = newNode;

        // Move tail to the new last node
        tail = newNode;
    }


    // Print the linked list
    public void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}


public class Example {

    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.printList(list.head);
    }
}

//
//
//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//
//}
//
//class CustomLinkedList {
//    Node head;
//
//    public void insert(int data) {
//        Node newNode = new Node(data); // 3
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        Node temp = head;
//
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = newNode;
//    }
//
//
//public class Example {
//    public static void main(String[] args) {
//
//
//        CustomLinkedList list = new CustomLinkedList();
//        list.insert(1);
//        list.insert(2);
//        list.insert(3);
//        list.insert(4);
//        list.insert(5);
//
//        list.printList(list.head);
//
//    }
//}
