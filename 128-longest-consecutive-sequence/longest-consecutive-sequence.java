class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        int consec = 1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i : set) {
            if (!set.contains(i-1)) {
                int count = 1;
                int temp = i;
                while (set.contains(temp + 1)) {
                    count++;
                    temp++;
                }
                if (count > consec) consec = count;
            }
        }
        return consec;
    }
}