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
    public int countNodes(TreeNode root) {
        if(root==null)
        return 0;
        int lh=0;
        TreeNode node=root;
        while(node!=null)
        {
            lh++;
            node=node.left;
        }
        node=root;
        int rh=0;
        while(node!=null)
        {
            rh++;
            node=node.right;
        }
        if(lh==rh)
        return (int)Math.pow(2,lh)-1;
        else
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}