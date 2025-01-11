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
    public ArrayList<Integer> al=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
       inOrder(root);
        for(int i=0;i<al.size()-1;i++)
        {
            if(al.get(i)>=al.get(i+1))
            return false;
        }
        return true;

    }
    void inOrder(TreeNode root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            al.add(root.val);
            inOrder(root.right);
        }
    }
    
}