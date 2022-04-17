import java.util.Stack;

import CTDLGT_Students.Students_Exercise.Lession_11._11_LeTheHoangHai.TreeNode;

public class _897_increasingOrderSerachTree {
    
    public TreeNode increasingBST(TreeNode root) {
        // if(root.left == null && root.right ==null) return root;
        TreeNode res = new TreeNode();
        if(root.left!= null) {
            res = increasingBST(root.left);
            TreeNode right = res.right;
            while (right!= null) {
                right =right.right;
            }
            root.left = null;
            right = root;
        }
        if(root.right!=null) root.right = increasingBST(root.right);
        return res ;
    }

    //i think this case using Stack is the best choice
    Stack<TreeNode> stack = new Stack() ;
    
    public TreeNode increasingBST(TreeNode root) {

        TreeNode res = new TreeNode();
        TreeNode right = new TreeNode();
        res.right = right;
        
        loadToStack(root);
         // System.out.println(stack.isEmpty());

        while(stack.isEmpty() == false) {
            System.out.println(stack.isEmpty());
            right = unloadFromStack();
            right =right.right;
        }
        

        return res.right;
        
    }

    private void loadToStack(TreeNode root) {
                System.out.println("adding");
        if(root ==null) return;
        if(root.right != null) loadToStack(root.right);
         stack.push(root);
        if(root.left!=null) loadToStack(root.left);
    }

    private TreeNode unloadFromStack() {
        TreeNode node = stack.pop();
        node.left = null;
        return node;
    }
}
