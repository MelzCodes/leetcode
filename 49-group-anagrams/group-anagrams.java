class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashy = new HashMap<>();
        for (String s : strs) {
            char[] sChars = s.toCharArray();
            Arrays.sort(sChars);
            String sorted = new String(sChars);
            if (!hashy.containsKey(sorted)) {
                hashy.put(sorted, new ArrayList<>());
            }
            hashy.get(sorted).add(s);
        }
        return new ArrayList<>(hashy.values());
    }
}