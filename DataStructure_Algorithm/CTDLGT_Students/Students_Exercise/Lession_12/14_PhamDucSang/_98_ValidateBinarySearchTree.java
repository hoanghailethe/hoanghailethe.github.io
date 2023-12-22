package aps.leetcodes.tree;

public class _98_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root, TreeNode left, TreeNode right) {
        if (root == null) {
            return true;
        }

        if (left != null && left.val >= root.val
                || right != null && right.val <= root.val) {
            return false;
        }
        return isValidBST(root.left, left, root)
                && isValidBST(root.right, root, right);
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
}
