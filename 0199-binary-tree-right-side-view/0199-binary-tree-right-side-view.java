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
    public List<Integer> rightSideView(TreeNode root) {
     ArrayDeque<TreeNode> al=new ArrayDeque<>();
     List<Integer> out=new ArrayList<>();
     if(root==null) return out;
     al.add(root);
     while(!al.isEmpty())
     {
        int size=al.size();
        for(int i=0;i<size;i++)
        {
            TreeNode node=al.poll();
            if(i==size-1)
            out.add(node.val);
            if(node.left!=null)
            al.offer(node.left);
            if(node.right!=null)
            al.offer(node.right);
        }
     }
     return out;

    }
}