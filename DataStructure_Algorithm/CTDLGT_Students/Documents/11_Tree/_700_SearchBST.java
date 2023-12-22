public class _700_SearchBST {

    //Tra ve node con trong curNode
    public TreeNode searchBST(TreeNode curNode, int x) {
        
        // Check input
        if(curNode == null)
            return null;
        TreeNode foundNode = null;
        if(x > curNode.val){
            foundNode = searchBST(curNode.right, x);
        }else if(x < curNode.val){
            foundNode = searchBST(curNode.left, x);
        }else{
            foundNode = curNode;
        }

        return foundNode;
    }
}
