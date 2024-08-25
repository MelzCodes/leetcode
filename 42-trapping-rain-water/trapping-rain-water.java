class Solution {
    public int trap(int[] height) {
        int p1 = 0;
        int p2 = height.length-1;
        int leftMax = height[p1];
        int rightMax = height[p2];
        int water = 0;
        while (p1 < p2) {
            if (leftMax < rightMax) {
                water += Math.min(leftMax, rightMax) - height[p1];
                p1++;
                leftMax = Math.max(leftMax, height[p1]);
            } else {
                water += Math.min(leftMax, rightMax) - height[p2];
                p2--;
                rightMax = Math.max(rightMax, height[p2]);
            }
        }
        return water;
    }
}