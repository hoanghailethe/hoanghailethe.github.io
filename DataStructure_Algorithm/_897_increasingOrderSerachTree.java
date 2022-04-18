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
//     Runtime: 0 ms, faster than 100.00% of Java online submissions for Increasing Order Search Tree.
// Memory Usage: 39.8 MB, less than 92.52% of Java online submissions for Increasing Order Search Tree.
    public TreeNode increasingBST(TreeNode root) {

        TreeNode res = new TreeNode();

        loadToStack(root);

        unloadFromStack(res);     
        

        return res.right;
        
    }

    private void loadToStack(TreeNode root) {
        System.out.println("adding");
        if(root ==null) return;
        if(root.right != null) loadToStack(root.right);
         stack.push(root);
        if(root.left!=null) loadToStack(root.left);
    }

    private void unloadFromStack(TreeNode root) {
        if(stack.isEmpty()) return;
        TreeNode node = stack.pop();
        node.left = null;
        if(node!=null) {
            root.right = node;
            unloadFromStack(root.right);
        }
    }
}


class Solution {
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root, al);
        return buildTree(al);
    }
    
    private TreeNode buildTree(ArrayList<Integer> al){
        if(al.size() == 0) return null;
        TreeNode root = new TreeNode(al.remove(0));
        root.right = buildTree(al);
        return root;
    }
    
    private void inorder(TreeNode root, ArrayList<Integer> al){
        if(root == null) return;
        inorder(root.left, al);
        al.add(root.val);
        inorder(root.right, al);
    }
}

// https://leetcode.com/problems/increasing-order-search-tree/discuss/1956051/JAVA-or-0MS-or-NAIVE-and-OPTIMIZED-or-SIMPLE-INORDER-TRAVERSAL-or