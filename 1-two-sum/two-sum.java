class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashy = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (hashy.containsKey(comp)) {
                return new int[]{hashy.get(comp), i};
            }
            hashy.put(nums[i], i);
        }
        return null;
    }
}