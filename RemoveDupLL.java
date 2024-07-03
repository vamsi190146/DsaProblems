class Solution {
    public Node removeAllDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        Node dummy = new Node(0); // Create a dummy node
        dummy.next = head;
        Node prev = dummy;
        Node curr = head;
        
        while (curr != null) {
            // Check for duplicates
            boolean isDuplicate = false;
            while (curr.next != null && curr.data == curr.next.data) {
                isDuplicate = true;
                curr = curr.next;
            }
            
            if (isDuplicate) {
                // Skip all duplicates
                prev.next = curr.next;
            } else {
                // Move prev pointer
                prev = prev.next;
            }
            
            // Move curr pointer
            curr = curr.next;
        }
        
        return dummy.next;
    }
}