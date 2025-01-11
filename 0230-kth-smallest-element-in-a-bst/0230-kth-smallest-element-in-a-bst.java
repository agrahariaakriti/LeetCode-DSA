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
    public int result=0;
    public int count=0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return result;
    }
    void inOrder(TreeNode root,int k)
    {
       if(root==null)
       return ;
        else
        {
            inOrder(root.left,k);
            count++;
            if(count==k)
            {
                result=root.val;
                return;
            }
            inOrder(root.right,k);
        }

    }
}