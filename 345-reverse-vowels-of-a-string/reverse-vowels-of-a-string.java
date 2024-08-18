class Solution {
    public String reverseVowels(String s) {
        char[] sChars = s.toCharArray();
        int p1 = 0;
        int p2 = s.length()-1;

        while (p1 < p2) {
            while (p1 < p2 && !isVowel(s.charAt(p1))) p1++;
            while (p1 < p2 && !isVowel(s.charAt(p2))) p2--;
            
            char temp = sChars[p1];
            sChars[p1] = sChars[p2];
            sChars[p2] = temp;
            
            p1++;
            p2--;
        }
        return new String(sChars);
    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') return true;
        return false;
    }

}