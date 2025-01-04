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
    public int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postIndex=inorder.length-1;
        return constructTree(inorder,postorder,0,inorder.length-1);

    }
    // public int postIndex=n;
    TreeNode constructTree(int io[],int po[],int is,int ie)
    {
        if(is>ie)
        return null;
        TreeNode root=new TreeNode(po[postIndex--]);
        int index=0;
        for(int i=is;i<=ie;i++)
        {
            if(io[i]==root.val)
            {
                index=i;break;
            }
        }
        root.right=constructTree(io,po,index+1,ie);
        root.left=constructTree(io,po,is,index-1);
        return root;
    }
}