package stanley;

import java.util.List;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }
}

class CLinkedList {

    ListNode head;
    ListNode tail;

    public void add(int data) {

        ListNode obj = new ListNode(data);

        if (head == null) {
            head = obj;
            tail = obj;
            return;
        }

        tail.next = obj;
        tail = obj;
    }

    // Print the complete list
    public void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    ListNode reverse() {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}

public class Example6 {

    public static void main(String[] args) {

        CLinkedList obj = new CLinkedList();

        obj.add(10);
        obj.add(20);

        obj.print();
        obj.head = obj.reverse();
        obj.print();

    }
}