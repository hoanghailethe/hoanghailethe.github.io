import java.util.ArrayList;
import java.util.List;

public class _173_BinarySearchTreeIterator {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class BSTIterator {
        public TreeNode root = new TreeNode();
        public List<Integer> list = new ArrayList<>();
        public int index = -1;
        
        public BSTIterator(TreeNode root) {
            this.root = root;
            this.inOrderTravel(root);
        }

        public int next() {
                index++;
                return list.get(index);
        }

        public boolean hasNext() {
            if(index < list.size() - 1){
                return true;
            } else {
                return false;
            }
        }

        public List<Integer> inOrderTravel(TreeNode root){
            if(root == null){
                return list;
            }
            inOrderTravel(root.left);
            list.add(root.val);
            inOrderTravel(root.right);
            return list;
        }
    }

    public static void main(String[] args) {
        TreeNode n0 = new TreeNode(10);
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(12);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(6);
        TreeNode n5 = new TreeNode(11);
        TreeNode n6 = new TreeNode(13);
        n0.left = n1;
        n0.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.left = n5;
        n2.right = n6;
        BSTIterator root = new BSTIterator(n0);
        System.out.println(root.next());
        System.out.println(root.next());
        System.out.println(root.hasNext());
        System.out.println(root.next());
        System.out.println(root.hasNext());
        System.out.println(root.next());
        System.out.println(root.hasNext());
        System.out.println(root.next());
        System.out.println(root.hasNext());
        System.out.println(root.next());
        System.out.println(root.hasNext());
        System.out.println(root.next());
        System.out.println(root.hasNext());
    }
}
