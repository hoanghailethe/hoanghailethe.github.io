public class _230_KthSmallestEleBST {
    public int kthSmallest(TreeNode root, int k) {
        int rankOfNode = 0;
        int maxRankFromRight= 0;
        int[] calRating = {rankOfNode, maxRankFromRight };

        return findKthSmallest( root , k);
    }

    public findKthSmallest (TreeNode node, int k, int[] calRating ) {
        int rankOfTopLeftNode = calRating[0];
        int maxRankFromRight= calRating[1];
        int rankOfNode = rankOfTopLeftNode + 

        if( rankOfNode == k ) return  node.val ;
        if( rankOfNode < k ) return findKthSmallest(node.left, k) ;
        else return findKthSmallest(node.right, k);
    }

    public int[] rating ()

}
