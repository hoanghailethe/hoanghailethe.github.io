package aps.leetcodes.tree;

import java.util.ArrayList;
import java.util.List;

public class _144_BinaryTreePreorderTraversal {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode rootNode) {
        if (rootNode == null) {

            return result;
        }

        result.add(rootNode.val);
        preorderTraversal(rootNode.left);
        preorderTraversal(rootNode.right);

        return result;
    }
}
