class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        int left = 0;
        int max = 1;
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            max = Math.max(max, set.size());
        }
        return max;
    }
}