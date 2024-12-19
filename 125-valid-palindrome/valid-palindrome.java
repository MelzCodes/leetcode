class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while (l < r) {
            while (alphaNumeric(s.charAt(l)) == -1 && l < r) {
                l++;
            } 
            while (alphaNumeric(s.charAt(r)) == -1 && l < r) {
                r--;
            }
            if (alphaNumeric(s.charAt(l++)) != alphaNumeric(s.charAt(r--))) {
                return false;
            }
        }
        return true;
    }

    private int alphaNumeric (char c) {
        if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
            return c;
        }
        if (c >= 'A' && c <= 'Z') {
            return c - 'A' + 'a';
        }
        return -1;
    }
}