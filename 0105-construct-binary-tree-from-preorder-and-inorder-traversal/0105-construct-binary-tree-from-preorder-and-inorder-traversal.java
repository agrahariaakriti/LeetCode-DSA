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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return treeConstruction(inorder,preorder,0,inorder.length-1);
    }
    public int preIndex=0;
    TreeNode treeConstruction(int io[],int po[],int is,int ie)
    {
        if(is>ie)
        return null;
        TreeNode root=new TreeNode(po[preIndex++]);
        int index=0;
        for(int i=is;i<=ie;i++)
        {
            if(io[i]==root.val)
            {index=i;break;}
        }
        root.left=treeConstruction(io,po,is,index-1);
        root.right=treeConstruction(io,po,index+1,ie);
        return root;
    }
}