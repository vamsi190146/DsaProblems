class Solution {
    public Node deleteNode(Node head, int x) {
        if (head == null || x <= 0) {
            return head; // Invalid position, return the original head
        }

        Node current = head;

        // Case 1: Deleting the head node
        if (x == 1) {
            head = current.next;
            if (head != null) {  // If the list is not empty now
                head.prev = null;
            }
            return head;
        }

        // Move to the node to be deleted
        for (int i = 1; current != null && i < x; i++) {
            current = current.next;
        }

        // If position is greater than the number of nodes
        if (current == null) {
            return head; // Position is out of range, return the original head
        }

        // Case 2: Deleting a node in the middle or end
        if (current.next != null) {  // If it's not the last node
            current.next.prev = current.prev;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }

        return head;
    }
