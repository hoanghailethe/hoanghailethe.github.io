public class _450_DeleteNodeInABST {
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

    public static TreeNode findLeaf(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null) {
            return root;
        }
        TreeNode leaf = findLeaf(root.left);
        return leaf;
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (root.left != null && root.left.val == key) {
            TreeNode nextNodeL = root.left.left;
            TreeNode nextNodeR = root.left.right;
            if (nextNodeL == null) {
                root.left = nextNodeR;
            } else if (nextNodeR == null) {
                root.left = nextNodeL;
            } else {
                TreeNode leaf = findLeaf(nextNodeR);
                leaf.left = nextNodeL;
                root.left = nextNodeR;
            }
            return root;
        }
        if (root.right != null && root.right.val == key) {
            TreeNode nextNodeL = root.right.left;
            TreeNode nextNodeR = root.right.right;
            if (nextNodeL == null) {
                root.right = nextNodeR;
            } else if (nextNodeR == null) {
                root.right = nextNodeL;
            } else {
                TreeNode leaf = findLeaf(nextNodeR);
                leaf.left = nextNodeL;
                root.right = nextNodeR;
            }
            return root;
        }
        if (key < root.val) {
            deleteNode(root.left, key);
        } else if (key > root.val) {
            deleteNode(root.right, key);
        } else {
            if (root.right == null) {
                return root.left;
            } else if(root.left == null){
                return root.right;
            } else {
                TreeNode leaf = findLeaf(root.right);
                if(leaf!= null){
                leaf.left = root.left;
                } else {
                    root.right.left = root.left;
                    
                }
                return root.right;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        // TreeNode n0 = new TreeNode(10);
        // TreeNode n1 = new TreeNode(5);
        // TreeNode n2 = new TreeNode(11);
        // TreeNode n3 = new TreeNode(3);
        // TreeNode n4 = new TreeNode(8);
        // TreeNode n5 = new TreeNode(1);
        // TreeNode n6 = new TreeNode(4);
        // TreeNode n7 = new TreeNode(7);
        // TreeNode n8 = new TreeNode(9);
        // TreeNode n9 = new TreeNode(6);
        // n0.left = n1;
        // n0.right = n2;
        // n1.left = n3;
        // n1.right = n4;
        // n3.left = n5;
        // n3.right = n6;
        // n4.left = n7;
        // n4.right = n8;
        // n7.left = n9;
        TreeNode n0 = new TreeNode(5);
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(6);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(7);
        n0.left = n1;
        n0.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.right = n5;
        deleteNode(n0, 5);
        System.out.println('a');
    }
}
