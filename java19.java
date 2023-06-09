import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int data) {
        this.val = data;
        left = null;
        right = null;
    }
}

public class main {
    public static boolean isSumTree(TreeNode root) {
        if (root == null
                || (root.left == null && root.right == null)) {
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr.left == null && curr.right == null) {
                continue;
            }
            int sum = 0;
            if (curr.left != null) {
                sum += curr.left.val;
                q.add(curr.left);
            }
            if (curr.right != null) {
                sum += curr.right.val;
                q.add(curr.right);
            }
            if (sum != curr.val) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(26);
        root.left = new TreeNode(10);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(3);

        if (isSumTree(root)) {
            System.out.println("Given binary tree is a sum tree.");
        } else {
            System.out.println("Given binary tree is not a sum tree.");
        }
    }
}