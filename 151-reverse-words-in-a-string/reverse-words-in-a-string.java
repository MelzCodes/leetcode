class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder ans = new StringBuilder();
        LinkedHashMap<Integer, String> hashy = new LinkedHashMap<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                hashy.put(i, currentWord.toString());
                currentWord.setLength(0);
            } else {
                currentWord.append(c);
                if (i == s.length()-1) hashy.put(i, currentWord.toString());
            } 
        }

        Object[] words = hashy.values().toArray();
        for (int i = words.length-1; i>=0; i--) {
            String word = words[i].toString().trim();
            if (word.length() == 0) continue;
            if (i == 0) ans.append(word);
            else ans.append(word + " ");
        }
        return ans.toString();
    }
}