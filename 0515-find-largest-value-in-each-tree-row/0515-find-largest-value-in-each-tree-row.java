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
    public List<Integer> largestValues(TreeNode root) {
    ArrayDeque<TreeNode> al=new ArrayDeque<>();
    List<Integer> list=new ArrayList<>();
   if(root==null)
   return list;
    al.add(root);
    int res=Integer.MIN_VALUE;
    while(!al.isEmpty())
    {
        int size=al.size();
        for(int i=0;i<size;i++)
        {
            TreeNode node=al.poll();
            if(node.left!=null)
            al.offer(node.left);
            if(node.right!=null)
            al.offer(node.right);
            res=Math.max(res,node.val);
        }
        list.add(res);
        res=Integer.MIN_VALUE;
    }
        return list;
    }
}