class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        if (s1.length() == s2.length()) return isPermutation(s1, s2);
        String temp = "";
        for (int i = 0; i < s1.length(); i++) {
            temp += s2.charAt(i);
        }
        int l = 0;
        for (int r = s1.length(); r <= s2.length(); r++) {
            if (isPermutation(temp, s1)) return true;
            if (r == s2.length()) return false;
            l++;
            temp = temp.substring(1) + s2.charAt(r);
        }
        return false;
    }

    private boolean isPermutation(String s1, String s2) {
        HashMap<Character, Integer> hashy = new HashMap<>();
        for (char c : s1.toCharArray()) {
            hashy.put(c, hashy.getOrDefault(c, 0)+1);
        }
        for (char c : s2.toCharArray()) {
            hashy.put(c, hashy.getOrDefault(c, 0) - 1);
        }
        for (int val : hashy.values()) {
            if (val != 0) return false;
        }
        return true;
    }
}