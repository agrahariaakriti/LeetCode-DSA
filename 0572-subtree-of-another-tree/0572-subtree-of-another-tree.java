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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
     ArrayDeque<TreeNode> al=new ArrayDeque<>();
     al.offer(root);
     while(!al.isEmpty())
     {
        TreeNode node=al.poll();
        if(node.val==subRoot.val)
        {
            if(isEqual(node,subRoot))
            return true;
        }
        if(node.left!=null)
        al.offer(node.left);
        if(node.right!=null)
        al.offer(node.right);
     }
    return false;
    }
    boolean isEqual(TreeNode p,TreeNode q)
    {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        else
        return p.val==q.val && isEqual(p.left,q.left) && isEqual(p.right ,q.right);
    }
}