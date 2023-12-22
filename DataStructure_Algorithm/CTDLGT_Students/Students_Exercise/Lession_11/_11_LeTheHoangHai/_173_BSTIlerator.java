import java.util.LinkedList;
import java.util.Queue;

public class _173_BSTIlerator {
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
class BSTIterator {
    
    Queue<TreeNode> nodes = new LinkedList<>();

    public void addNode(TreeNode node) {
        if (node.left != null) addNode(node.left);
        nodes.add(node);
        if(node.right != null) addNode(node.right);
    }

    public BSTIterator(TreeNode root) {
        addNode(root);
    }
    
    public int next() {
        return nodes.poll().val;
    }
    
    public boolean hasNext() {
        return !nodes.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
}
