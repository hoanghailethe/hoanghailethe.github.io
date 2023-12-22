import java.util.ArrayList;
import java.util.List;

//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
class _144BinaryTreePreorderTraversal {
    List<Integer>listResult = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root)
    {
        // Dieu kien dung
        if(root == null)
            return listResult;

        // Task
        listResult.add(root.val);
        System.out.println(curNode.val);

        // Goi de quy
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return listResult;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r2 = new TreeNode();
        TreeNode r3 = new TreeNode(2);
        TreeNode r4 = new TreeNode(3);

        preorderTraversal(root);
        
    }
}