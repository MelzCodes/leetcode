# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    res = None
    k = None
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.k = k
        self.inorder(root)
        return self.res
    
    def inorder(self, root):
        if root is None:
            return
        if self.res is not None:
            return
        
        self.inorder(root.left)
 
        self.k -= 1
        if self.k == 0:
            self.res = root.val
            return

        self.inorder(root.right)