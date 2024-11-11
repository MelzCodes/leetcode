class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int res = 0;
        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            int max = Collections.max(map.values());
            if (right - left + 1 - max > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            res = Math.max(right - left + 1, res);
        }
        return res;
    }
}