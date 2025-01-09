# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        count = 0
        ans = 0
        def dfs(root):
            if not root:
                return
            
            dfs(root.left)
            nonlocal count
            count += 1
            if count == k:
                nonlocal ans
                ans = root.val
                return
            dfs(root.right)
            return

        dfs(root)
        return ans
        