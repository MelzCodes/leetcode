# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    ans = False
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        def sameTree(root, subRoot):
            if not root or not subRoot:
                return not root and not subRoot
            
            if root.val == subRoot.val:
                return sameTree(root.left, subRoot.left) and sameTree(root.right, subRoot.right)

            return False

        def inorder(root, subRoot):
            if self.ans:
                return

            if not root or not subRoot:
                return

            if root.val == subRoot.val:
                self.ans = sameTree(root, subRoot)
            
            inorder(root.left, subRoot)
            inorder(root.right, subRoot)
            return
                    
        inorder(root, subRoot)
        return self.ans

        