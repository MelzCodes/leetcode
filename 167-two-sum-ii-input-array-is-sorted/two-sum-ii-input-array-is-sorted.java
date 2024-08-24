class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length - 1;
        while (p1 < p2) {
            int x1 = numbers[p1];
            int x2 = numbers[p2];
            if (x1 + x2 > target) p2--;
            else if (x1 + x2 < target) p1++;
            else return new int[]{++p1, ++p2};
        }
        return null;
     }
}