class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder ans = new StringBuilder();
        int p1 = 0;
        int p2 = s.length()-1;
        StringBuilder p1Word = new StringBuilder();
        StringBuilder p2Word = new StringBuilder();
        ArrayList<String> p1Words = new ArrayList<>();
        ArrayList<String> p2Words = new ArrayList<>();
        int index = 0;
        while (p1 <= p2) {
            while (index != s.length() && s.charAt(p1) != ' ' && p1 <= p2) {
                p1Word.append(s.charAt(p1));
                p1++;
                index++;
            }
            while (s.charAt(p2) != ' ' && p1 <= p2) {
                p2Word.append(s.charAt(p2));
                p2--;
            }
            p1Words.add(p1Word.toString().trim());
            p2Words.add(reverseString(p2Word.toString().trim()));
            p1Word.setLength(0);
            p2Word.setLength(0);
            p1++;
            p2--;
        }
        for (String str : p2Words) {
            if (str.length() == 0) continue;
            ans.append(str + " ");
        }
        for (int i = p1Words.size()-1; i >= 0; i--) {
            if (p1Words.get(i).length() == 0) continue;
            if (i == 0) ans.append(p1Words.get(i));
            else ans.append(p1Words.get(i) + " ");
        }
        return ans.toString();
    }

    private String reverseString(String s) {
        if (s.length() == 0) return s;
        return (reverseString(s.substring(1)) + s.charAt(0));
    }
}