# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        ans = True
        def dfs(root):
            nonlocal ans
            if not ans:
                return [False, 0]
            if not root:
                return [True, 0]

            left = dfs(root.left)
            right = dfs(root.right)

            if not left[0] or not right[0] or abs(left[1] - right[1]) > 1:
                ans = False
                return [False, max(left[1], right[1]) + 1]
            else:
                return [True, max(left[1], right[1]) + 1]
        
        dfs(root)
        return ans

        