import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class Sample {

    static List<Integer> listResult = new ArrayList<>();
    public static List<Integer> preorderTraversal(TreeNode curNode)
    {
        // Dieu kien dung
        if(curNode == null)
            return listResult;

        // Task
        listResult.add(curNode.value);
        System.out.println(curNode.value);

        // Goi de quy
        preorderTraversal(curNode.left);
        preorderTraversal(curNode.right);

        return listResult;
    }

    public static void main(String[] args) {
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n0.left = n1; n0.right = n2;
        n1.left = n3; n1.right = n4;
        n4.left = n6; n4.right = n7;
        n2.right = n5;

        PreOrder(n0);

    }
}
