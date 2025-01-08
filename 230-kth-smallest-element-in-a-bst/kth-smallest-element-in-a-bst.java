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
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return maxHeap.peek();
    }

    private void dfs(TreeNode root, int k) {
        if (root == null) return;

        dfs(root.left, k);
        maxHeap.add(root.val);
        if (maxHeap.size() > k) {
            maxHeap.poll();
        }
        dfs(root.right, k);

        return;
    }
}