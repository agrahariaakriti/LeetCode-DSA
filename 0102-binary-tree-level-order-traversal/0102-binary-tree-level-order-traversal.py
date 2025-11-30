# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        al=[]
        res=[]
        if root==None:
            return []
        al.append(root)
        while len(al)>0:   
            res1=[] 
            size=len(al)
            while(size>0):
                node=al.pop(0)
                res1.append(node.val)
                if node.left!=None:
                    al.append(node.left)
                if node.right!=None:
                    al.append(node.right)
                size-=1    
            res.append(res1.copy())
        return res
