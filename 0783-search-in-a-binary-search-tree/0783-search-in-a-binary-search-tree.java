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
    public TreeNode searchBST(TreeNode root, int val) {
        
        return search(root,val);
    }
    TreeNode search(TreeNode root,int val)
    {
     ArrayDeque<TreeNode> al=new ArrayDeque<>();
     al.offer(root);
     while(!al.isEmpty())
     {
        int size=al.size();
        for(int i=0;i<size;i++)
        {
            TreeNode node=al.poll();
            if(node.val==val)
            return node;
            if(node.left!=null)
            al.offer(node.left);
            if(node.right!=null)
            al.offer(node.right);
        }
     }
     return null;
    }
}