package anhdv.binarytree;

/**
 *
 * @author anhdv
 */
public class _701_InsertIntoABinarySearchTree {
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        
        if (root.val > val)
            root.left = insertIntoBST(root.left, val);
        else
            root.right = insertIntoBST(root.right, val);
        
        return root;
    }
    
    public static void main(String[] args) {
        
        TreeNode n0 = new TreeNode(4);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(1);
        TreeNode n4 = new TreeNode(3);
        n0.left = n1;
        n0.right = n2;
        n1.left = n3;
        n1.right = n4;

        int key = 5;
        TreeNode result = new _701_InsertIntoABinarySearchTree().insertIntoBST(n0, key);
        int a = 0;
    }
}
