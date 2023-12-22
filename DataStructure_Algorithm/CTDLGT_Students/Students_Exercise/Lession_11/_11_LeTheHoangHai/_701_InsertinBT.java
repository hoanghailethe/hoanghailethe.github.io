public class _701_InsertinBT {
    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) root = new TreeNode(val);
        //dk dung
        if (val > root.val && root.right == null) {
            root.right = new TreeNode(val);
        }
        if (val < root.val && root.left == null) {
            root.left = new TreeNode(val);
        }

        //de quy
        if ( val > root.val && root.right != null) {
            TreeNode right = insertIntoBST(root.right, val);
            root.right = right;
        }

        if ( val < root.val && root.left != null) {
            TreeNode left = insertIntoBST(root.left, val);
            root.left = left;
        }

        return root;
    }
}
