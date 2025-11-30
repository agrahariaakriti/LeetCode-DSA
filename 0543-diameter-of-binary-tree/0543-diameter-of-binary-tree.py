# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.maxheight=0
        self.depth(root)
        return self.maxheight
    def depth(self,root):
        if root==None:
            return 0

        left=self.depth(root.left)
        right=self.depth(root.right)
        self.maxheight=max(self.maxheight,left+right)

        return 1+max(left,right)
