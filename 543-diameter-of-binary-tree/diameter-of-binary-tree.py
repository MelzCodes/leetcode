# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        res = 0
        def diameter(root):
            if not root:
                return 0

            l = diameter(root.left)
            r = diameter(root.right)

            nonlocal res
            res = max(res, l+r)

            return max(l, r) + 1

        diameter(root)
        return res

        