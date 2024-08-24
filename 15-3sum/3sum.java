class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int p1 = i+1;
            int p2 = nums.length-1;
            while (p1 < p2) {
                int total = nums[i] + nums[p1] + nums[p2];
                if (total < 0) p1++;
                else if (total > 0) p2--;
                else {
                    ans.add(List.of(nums[i], nums[p1], nums[p2]));
                    p1++;
                    p2--;
                    while (nums[p1] == nums[p1-1] && p1 < p2) p1++;
                }
            }
        }
        return ans;
    }
}