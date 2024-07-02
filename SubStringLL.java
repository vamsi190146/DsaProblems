class Solution {
    public boolean compute(Node root) {
        StringBuilder sb = new StringBuilder();
   
        Node temp = root;
        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next;
        }
  
        String combinedString = sb.toString();
        

        int left = 0;
        int right = combinedString.length() - 1;
        
        while (left < right) {
            if (combinedString.charAt(left) != combinedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}