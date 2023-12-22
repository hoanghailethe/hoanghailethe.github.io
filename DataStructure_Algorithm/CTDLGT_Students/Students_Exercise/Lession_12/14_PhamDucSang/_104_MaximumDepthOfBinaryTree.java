package aps.leetcodes.tree;

public class _104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftLevel = maxDepth(root.left) + 1;
        int rightLevel = maxDepth(root.right) + 1;

        return Math.max(leftLevel, rightLevel);
    }
}
