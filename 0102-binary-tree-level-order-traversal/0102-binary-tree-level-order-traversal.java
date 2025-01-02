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
    public List<List<Integer>> levelOrder(TreeNode root) {
    ArrayDeque<TreeNode> al=new ArrayDeque<>();
    List<List<Integer>> al1=new ArrayList<>();
    if(root==null)
       return al1;
    al.add(root);
    while(!al.isEmpty())
    {
        ArrayList<Integer> sub=new ArrayList<>();
        int size=al.size();
        for(int i=0;i<size;i++)
        {
            TreeNode node =al.poll();
            if(node.left!=null)
            al.add(node.left);
            if(node.right!=null)
            al.add(node.right);

            sub.add(node.val);
        }
        al1.add(sub);
    }
        return al1;
    }
}