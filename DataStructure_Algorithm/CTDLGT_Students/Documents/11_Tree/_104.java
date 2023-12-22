public class _104 {
    public int maxDepth(TreeNode curNode) {

        // Dieu kien dung | Kiem tra input
        if(curNode == null)
            return 0;

        int heightLeft = maxDepth(curNode.left) + 1;
        int heightRight = maxDepth(curNode.right) + 1;

        return Math.max(heightLeft, heightRight);
    }
}
