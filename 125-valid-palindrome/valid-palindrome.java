class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length()-1;
        while (p1 < p2) {
            while (alphaNumeric(s.charAt(p1)) == -1 && p1 < p2) {
                p1++;
            }
            while (alphaNumeric(s.charAt(p2)) == -1 && p1 < p2) {
                p2--;
            }
            if (alphaNumeric(s.charAt(p1++)) != alphaNumeric(s.charAt(p2--))) 
                return false;
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