import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            // Current must be null at this point
            current = stack.pop();
            output.add(current.val);
            // We have visited the node and its left subtree. Now it's the right subtree's turn
            current = current.right;
        }
        return output;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a sample binary tree:
        //     1
        //    / \
        //   2   3
        //  / \
        // 4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution solution = new Solution();
        List<Integer> result = solution.inorderTraversal(root);

        System.out.println(result); // Expected output: [4, 2, 5, 1, 3]
    }
}
