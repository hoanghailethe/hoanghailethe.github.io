package day09;

public class _450_DeleteNodeInABST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null) {
                return root.right;
            }
            TreeNode returnNode = root.left;
            TreeNode prev = root;
            while (returnNode.right != null) {
                prev = returnNode;
                returnNode = returnNode.right;
            }
            returnNode.right = root.right;
            if (prev != root) {
                prev.right = returnNode.left;
                returnNode.left = root.left;
            }

            return returnNode;
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
}
