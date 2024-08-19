class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] products = new int[nums.length];
        int[] zeroFilled = new int[nums.length];
        int zeroCount = 0;
        for (int num : nums) {
            if (num != 0) product *= num;
            else zeroCount++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) products[i] = product;
            else if (zeroCount == 1) products[i] = 0;
            else products[i] = product/nums[i];
            zeroFilled[i] = 0;
        }
        return zeroCount <= 1 ? products : zeroFilled;
    }
}