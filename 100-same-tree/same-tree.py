# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        tree1 = []
        tree2 = []
        
        def inorder(node, path):
            if not node:
                return
            inorder(node.left, path)
            path.append(node)
            inorder(node.right, path)
        
        inorder(p, tree1)
        inorder(q, tree2)

        if len(tree1) != len(tree2):
            return False

        for i in range(len(tree1)):
            node1 = tree1[i]
            node2 = tree2[i]
            if node1.val == node2.val:
                if node1.left and node2.left:
                    if node1.left.val != node2.left.val:
                        return False
                elif node1.left or node2.left:
                    return False
                
                if node1.right and node2.right:
                    if node1.right.val != node2.right.val:
                        return False
                elif node1.right or node2.right:
                    return False

            else:
                return False

        return True
        