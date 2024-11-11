class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char right = s.charAt(r);
            map.put(right, map.getOrDefault(right, 0) + 1);
            int max = Collections.max(map.values());
            if (r - l + 1 - max > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(r - l + 1, res);
        }
        
        return res;
    }
}