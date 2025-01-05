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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> al=new Stack<>();
        List<Integer> res=new ArrayList<>();
        if(root==null)
        return res;
        TreeNode curr=root;
        al.push(root);
        while(!al.isEmpty())
        {
            curr=al.pop();
            res.add(curr.val);
            if(curr.right!=null)
            al.push(curr.right);
            if(curr.left!=null)
            al.push(curr.left);
        }
        return res;
    }
}