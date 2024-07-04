/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean flag=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
       if(p==null && q==null)
         return flag;

       if((p!=null && q==null)||(p==null && q!=null)||(p.val!=q.val))
         return false;
        
        flag = isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
       
        return flag;
    }
}