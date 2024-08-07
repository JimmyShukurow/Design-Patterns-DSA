package io.smartir.leetcode.DSA.easy;

public class LeetCode112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        targetSum -= root.val;

        if (targetSum == 0 && root.left == null && root.right == null) return true;

        boolean left = hasPathSum(root.left, targetSum);
        boolean right = hasPathSum(root.right, targetSum);

        return (left || right);
    }
}
