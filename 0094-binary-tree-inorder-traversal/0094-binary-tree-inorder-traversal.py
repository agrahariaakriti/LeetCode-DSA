# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        al=[]
        self.inorder(root,al)
        return al

    def inorder(self,root,al):
        if root is None:
            return 

        self.inorder(root.left,al)
        al.append(root.val)
        self.inorder(root.right,al)
