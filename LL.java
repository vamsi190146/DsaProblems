class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListOperations {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        System.out.println("Original linked list:");
        printLinkedList(head);

        head = insertAtBeginning(head, 0);
        System.out.println("Linked list after inserting 0 at the beginning:");
        printLinkedList(head);

        head = deleteAtEnd(head);
        System.out.println("Linked list after deleting element at the end:");
        printLinkedList(head);
    }

    public static ListNode insertAtBeginning(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        return newNode;
    }

    public static ListNode deleteAtEnd(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
    public static void printLinkedList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
