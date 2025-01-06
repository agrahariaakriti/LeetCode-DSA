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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode n1=new TreeNode(val);
        TreeNode node=root;
        TreeNode parent=null;
        if(root==null)
        return n1;
         while(node!=null)
         {
            if(node.val>val)
            { parent=node;
             node=node.left;}
            else if(node.val<val)
            {parent=node;node=node.right;}
            else
            return root;
         }
         if(parent==null)
         return n1;
         if(parent.val>val)
         parent.left=n1;
         else
         parent.right=n1;
        return root;
    }
}