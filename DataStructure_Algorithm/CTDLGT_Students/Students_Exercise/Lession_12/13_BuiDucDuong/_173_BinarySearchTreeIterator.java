package day09;

import java.util.LinkedList;
import java.util.Queue;

public class _173_BinarySearchTreeIterator {
    public class TreeNode {
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

    class BSTIterator {
        Queue<Integer> list;

        public BSTIterator(TreeNode root) {
            list = new LinkedList<>();
            inorder(root);
        }

        private void inorder(TreeNode root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }

        public int next() {
            return list.poll();
        }

        public boolean hasNext() {
            return !list.isEmpty();
        }
    }
}
