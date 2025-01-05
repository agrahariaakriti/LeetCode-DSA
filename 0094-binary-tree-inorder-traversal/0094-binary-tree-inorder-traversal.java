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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> out=new ArrayList<>();
        Stack<TreeNode> al=new Stack<>();
        if(root==null)return out;
        // al.push(root);
        TreeNode curr=root;
        while(!al.isEmpty() || curr!=null)
        {
            while(curr!=null)
            {
                al.push(curr);curr=curr.left;
            }
            curr=al.pop();
            out.add(curr.val);
            curr=curr.right;
        }
        return out;

    }
}