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
        ListNode listNode = new ListNode(val);
        if (head == null) {
            head = tail = listNode;
        } else {
            tail.next = listNode;
            tail = listNode;
        }
    }

    public ListNode getHead() {
        return head;
    }
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

}


public class AddTwoNumbers {
    public static void main(String[] args) {

        MyLinkedList list1 = new MyLinkedList();
        list1.add(2);
        list1.add(4);
        list1.add(3);

        MyLinkedList list2 = new MyLinkedList();
        list2.add(5);
        list2.add(6);
        list2.add(4);

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
