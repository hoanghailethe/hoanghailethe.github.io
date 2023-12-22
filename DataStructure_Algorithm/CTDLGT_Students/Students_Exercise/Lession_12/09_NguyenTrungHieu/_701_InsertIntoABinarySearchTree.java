public class _701_InsertIntoABinarySearchTree {
    public static class TreeNode {
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

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if(root == null){
            root = newNode;
            return root;
        }
        if(val<root.val){
            if(root.left == null){
                root.left = newNode;
            } else {
                insertIntoBST(root.left, val);
            }
        } else {
            if(root.right == null){
                root.right = newNode;
            } else {
                insertIntoBST(root.right, val);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode n0 = new TreeNode(5);
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(8);
        TreeNode n3 = new TreeNode(11);
        TreeNode n4 = new TreeNode(7);
        TreeNode n5 = new TreeNode(2);
        TreeNode n6 = new TreeNode(13);
        TreeNode n7 = new TreeNode(4);
        TreeNode n8 = new TreeNode(1);
        n0.left = n1;
        n0.right = n2;
        n1.left = n3;
        n3.left = n4;
        n3.right = n5;
        n2.left = n6;
        n2.right = n7;
        n7.right = n8;
        insertIntoBST(n0, 6);
    }
}
