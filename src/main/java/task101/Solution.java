package task101;

import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
}

public class Solution {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root.left, root.right);
    }

    private static boolean helper(TreeNode ptr1, TreeNode ptr2) {
        if (ptr1 == null && ptr2 == null) {
            return true;
        }
        if (ptr1 == null || ptr2 == null) {
            return false;
        }
        return ptr1.val == ptr2.val && helper(ptr1.left, ptr2.right) && helper(ptr1.right, ptr2.left);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4),new TreeNode(3)));
        TreeNode root2 = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null,new TreeNode(3)));
        System.out.println(isSymmetric(root1));
        System.out.println(isSymmetric(root2));
    }
}
