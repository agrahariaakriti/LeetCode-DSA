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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
        return root;
        if(root.val>key)
        root.left=deleteNode(root.left,key);
        else if(root.val<key)
        root.right=deleteNode(root.right,key);
        else
        {
            if(root.left==null && root.right==null) return null;
            if(root.left==null && root.right!=null)
            return root.right;
            else if(root.left!=null && root.right==null)
            return root.left;
            else
            {
                TreeNode node=sucessor(root);
                root.val=node.val;
                root.left=deleteNode(root.left,node.val);
            }
        }
        return root;
    }
    TreeNode sucessor(TreeNode root)
    {
        TreeNode curr=root.left;
        while(curr!=null && curr.right!=null)
        {
            curr=curr.right;
        }
        return curr;
    }
}