class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    public boolean areIdentical(Node head1, Node head2) {
 
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                return false;
            }
     
            head1 = head1.next;
            head2 = head2.next;
        }
        
  
        return head1 == null && head2 == null;
    }

    public static void main(String[] args) {
  
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        
       
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);
        
        Solution solution = new Solution();
        System.out.println(solution.areIdentical(head1, head2)); 
        
  
        Node head3 = new Node(1);
        head3.next = new Node(2);
        head3.next.next = new Node(3);
        head3.next.next.next = new Node(4);
        head3.next.next.next.next = new Node(6);
        
        System.out.println(solution.areIdentical(head1, head3)); // Output: false
    }
}
