package aps.leetcodes.tree;

public class _112_PathSum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (targetSum == root.val
                && root.left == null
                && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, targetSum-root.val)
                || hasPathSum(root.right, targetSum-root.val);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(11);
        TreeNode n4 = new TreeNode(7);
        TreeNode n5 = new TreeNode(2);
        TreeNode n6 = new TreeNode(8);
        TreeNode n7 = new TreeNode(13);
        TreeNode n8 = new TreeNode(4);
        TreeNode n9 = new TreeNode(1);

        n1.left = n2; n1.right = n6;
        n2.left = n3;
        n3.left = n4; n3.right = n5;
        n6.left = n7; n6.right = n8;
        n8.right = n9;

        int targetSum = 22;
        System.out.println(hasPathSum(n1, 22));
    }
}
