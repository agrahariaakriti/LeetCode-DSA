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
        if(root==null) return 0;
        ArrayDeque<TreeNode> al=new ArrayDeque<>();
        al.add(root);
        int count=0;
        while(!al.isEmpty())
        {
            int size=al.size();
            count+=size;
            for(int i=0;i<size;i++)
            {
                TreeNode node=al.poll();
                if(node.left!=null)
                al.offer(node.left);
                if(node.right!=null)
                al.offer(node.right);
            }
        }
        return count;

    }
}