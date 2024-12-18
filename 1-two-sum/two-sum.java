class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashy = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (hashy.containsKey(nums[i])) {
                return new int[] {hashy.get(nums[i]), i};
            } 
            hashy.put(comp, i);
        }   
        return null;
    }
}