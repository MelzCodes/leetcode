class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        int p1 = 0;
        int p2 = s.length()-1;

        while (p1 < p2) {
            int p1Char = convertToAlphanumeric(s.charAt(p1));
            int p2Char = convertToAlphanumeric(s.charAt(p2));

            if (p1Char == -1) {
                p1++;
            } else if (p2Char == -1) {
                p2--;
            } else if (p1Char != p2Char) {
                return false;
            } else {
                p1++;
                p2--;
            }
        }
        return true;
    }
    
    private int convertToAlphanumeric(char c) {
        if (c >= '0' && c <= '9' || c >= 'a' && c <= 'z') {
            return c;
        } else if (c >= 'A' && c <= 'Z') {
            return c - 'A' + 'a';
        }
        return -1;
    }
}