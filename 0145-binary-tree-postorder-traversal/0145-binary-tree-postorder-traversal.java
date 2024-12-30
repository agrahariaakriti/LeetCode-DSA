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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        postOrder(root,al);
        return al;

    }
    void postOrder(TreeNode root,ArrayList<Integer> al)
    {
        if(root!=null)
        {
            postOrder(root.left,al);
            postOrder(root.right,al);
            al.add(root.val);
        }
    }
}