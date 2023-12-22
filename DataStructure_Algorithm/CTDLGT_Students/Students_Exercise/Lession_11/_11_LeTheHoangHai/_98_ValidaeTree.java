import java.util.LinkedList;
import java.util.Queue;

public class _98_ValidaeTree {
    public static boolean isValidBST(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();

        addNodes(root, nodes);

        TreeNode cur = nodes.poll();
        while (!nodes.isEmpty()) {
            TreeNode next = nodes.poll();
            if (cur.val >= next.val) return false;
            cur = next; 
        }
        return true; 
    }

    public static void addNodes(TreeNode root, Queue nodes) {
        if (root.left != null) addNodes(root.left, nodes);
        nodes.add(root);
        if(root.right != null) addNodes(root.right, nodes);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(isValidBST(a));
    }
    //https://stackoverflow.com/questions/57857855/could-not-find-or-load-main-class-vs-code
}
