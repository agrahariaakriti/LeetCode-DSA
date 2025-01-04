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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayDeque<TreeNode> al=new ArrayDeque<>();
        List<List<Integer>> out=new ArrayList<>();
        if(root==null)
        return out;
        al.add(root);
        int count=0;
        while(!al.isEmpty())
        {
            ArrayList<Integer> res =new ArrayList<>();
            int size=al.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=al.poll();
                res.add(node.val);
                if(node.left!=null)
                al.offer(node.left);
                if(node.right!=null)
                al.offer(node.right);
            }
            if(count%2!=0)
            {Collections.reverse(res);}
            out.add(res);
            count++;
        }
        return out;

    }
}