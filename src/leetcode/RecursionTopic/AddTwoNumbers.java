package leetcode.RecursionTopic;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    ListNode head;
    ListNode tail;

    // Add at end
    public void add(int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public ListNode getHead() {
        return head;
    }
}


public class AddTwoNumbers {
    public static void main(String[] args) {

        // l1 = [9,9,9,9,9,9,9]
        MyLinkedList list1 = new MyLinkedList();
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);

        // l2 = [9,9,9,9]
        MyLinkedList list2 = new MyLinkedList();
        list2.add(9);
        list2.add(9);
        list2.add(9);
        list2.add(9);

        ListNode result = addTwoNumbers(list1.getHead(), list2.getHead());
        printList(result);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
    }

}
