import java.util.LinkedList;
import java.util.List;

public class _144_BinaryTReePReOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nodes = new LinkedList<>();
        
        if (root == null) {
            return nodes;
        }

        nodes.add(root.val);
        nodes.addAll(preorderTraversal(root.left));
        nodes.addAll(preorderTraversal(root.right));

        return nodes;
    }
}
