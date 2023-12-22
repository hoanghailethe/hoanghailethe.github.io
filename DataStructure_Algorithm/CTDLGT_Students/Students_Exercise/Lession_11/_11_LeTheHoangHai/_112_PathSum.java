public class _112_PathSum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;    // Dk dung:
        return checkSide(root, 0, targetSum);
    }

    public static boolean checkSide(TreeNode node, int curSum, int targetSum) {
        TreeNode curNode = node;
        int newSum = curSum + node.val; 

        if (curNode.left != null && curNode.right != null) {
            return checkSide(curNode.left, newSum, targetSum)
            || checkSide(curNode.right, newSum, targetSum);
        }
        
        if (curNode.left != null)
            return checkSide(curNode.left, newSum, targetSum);
        if (curNode.right != null)
            return checkSide(curNode.right, newSum, targetSum);

        if (curNode.left == null && curNode.right == null) {
            return newSum == targetSum;
        }
        return false;
    }

    
    public static void main(String[] args) {
        // [5,4,8,11,null,13,4,7,2,null,null,null,1]
        // 22
        TreeNode a = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        System.out.println(hasPathSum(a, 22));

    }
}
