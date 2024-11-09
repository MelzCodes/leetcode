class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashy = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashy.containsKey(nums[i]) && i - hashy.get(nums[i]) <= k) return true;
            hashy.put(nums[i], i);
        }
        return false;
    }
}