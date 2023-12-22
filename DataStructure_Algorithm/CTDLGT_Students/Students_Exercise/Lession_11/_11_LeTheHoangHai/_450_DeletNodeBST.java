public class _450_DeletNodeBST {
    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        //DK dung la delete o root
        if (root.val == key) {
            if (root.right == null) return root.left;
            if (root.left == null) return root.right; 
            //case root Right and Left both != null;
            TreeNode left1stNode = root.left;
            //if right of first node null
            if(left1stNode.right == null) {
                //delet 1 Node in left
                root.val = left1stNode.val;
                root.left = left1stNode.left;
                return root;
            }

            //find the max in the right of first.
            TreeNode maxOf1stLeft = left1stNode.right;
            while ( maxOf1stLeft.right != null) {
                maxOf1stLeft = maxOf1stLeft.right;
            }
            root.val = maxOf1stLeft.val;
            left1stNode.right = deleteNode(left1stNode.right, maxOf1stLeft.val);
            return root;
        }
        //dequy
        if (root.val > key ) {
            root.left = deleteNode(root.left, key);
        } 

        if (root.val < key ){
            root.right = deleteNode(root.right, key);
        }

        return root;
    }

    public static void main(String[] args) {
        // [5,3,6,2,4,null,7]
        // 0   
        // TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));
        
        // [4,null,7,6,8,5,null,null,9]
        // 7
        //TreeNode root = new TreeNode(4, null, new TreeNode(7, new TreeNode(6, new TreeNode(5), null), new TreeNode(8, null, new TreeNode(9))))
              
        // [5,3,6,2,4,null,7]
        // 5
        //7
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));
              
        System.out.println(deleteNode(root, 7));
    }
}
