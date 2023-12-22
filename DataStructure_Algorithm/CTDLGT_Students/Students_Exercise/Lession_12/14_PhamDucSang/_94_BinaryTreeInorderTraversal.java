package aps.leetcodes.tree;

import java.util.ArrayList;
import java.util.List;

public class _94_BinaryTreeInorderTraversal {
    public List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }

        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);

        return result;
    }
}