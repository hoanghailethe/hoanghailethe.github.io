package aps.leetcodes.tree;

public class _701_InsertIntoABinarySearchTree {
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        } else if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(7);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(3);

        n1.left = n2; n1.right = n3;
        n2.left = n4; n2.right = n5;

        insertIntoBST(n1, 5);
        System.out.println();
    }
}
