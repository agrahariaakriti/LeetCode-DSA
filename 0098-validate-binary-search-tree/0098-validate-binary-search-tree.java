/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return inOrder(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean inOrder(TreeNode root,long min,long max)
    {
        if(root==null)
        return true;
        else if(root.val<=min || root.val>=max)
        return false;
        else
        return inOrder(root.left,min,root.val) && inOrder(root.right,root.val,max);
    }

}