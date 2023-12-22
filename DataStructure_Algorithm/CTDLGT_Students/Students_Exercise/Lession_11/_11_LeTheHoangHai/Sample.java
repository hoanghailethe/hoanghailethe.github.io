public class Sample {

    public static void PreOrder(TreeNode curNode)
    {
        // Dieu kien dung
        if(curNode == null)
            return;

        // Task
        System.out.println(curNode.value);

        // Goi de quy
        PreOrder(curNode.left);
        PreOrder(curNode.right);
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

        n5.left = n1; n5.right = n6;
        n1.left = n0; n1.right = n3;
        n3.left = n2; n3.right = n4;
        n6.right = n7;

        int o = 0;

        PreOrder(n5);
    }

 }

