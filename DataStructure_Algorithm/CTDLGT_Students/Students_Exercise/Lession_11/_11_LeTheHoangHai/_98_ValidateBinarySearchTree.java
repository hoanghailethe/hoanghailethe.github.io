public class _98_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return false;
        if (root.right == null && root.left == null)
            return true;
        if (root.left == null && root.right != null)
            return root.val < minVal(root.right) && root.val < root.right.val && isValidBST(root.right);
        if (root.right == null && root.left != null)
            return root.val > maxVal(root.left) && root.val > root.left.val && isValidBST(root.left);

        return isValidBST(root.right) && isValidBST(root.left) && root.val < minVal(root.right)
                && root.val > maxVal(root.left);

    }

    public static int maxVal(TreeNode root) {
        if (root.right != null && root.left != null) {
            return Math.max(maxVal(root.left), maxVal(root.right));
        }
        if (root.right == null && root.left != null)
            return maxVal(root.left);
        if (root.left == null && root.right != null)
            return maxVal(root.right);
        return root.val;
    }

    public static int minVal(TreeNode root) {
        if (root.right != null && root.left != null) {
            return Math.min(minVal(root.left), minVal(root.right));
        }
        if (root.right == null && root.left != null)
            return minVal(root.left);
        if (root.left == null && root.right != null)
            return minVal(root.right);
        return root.val;
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(isValidBST(a));
    }
}
