class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashy = new HashMap<>();
        int[] ans = new int[k];
        for (int num : nums) {
            if (!hashy.containsKey(num)) {
                hashy.put(num, 1);
            }
            hashy.put(num, hashy.get(num) + 1);
        }
        hashy = sortByValue(hashy);
        Integer[] keys = hashy.keySet().toArray(new Integer[0]);

        for (int i = 0; i<k; i++) {
            ans[i] = keys[keys.length - 1 - i];
        }
        return ans;
    }

    private HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) {
        HashMap<Integer, Integer> temp
            = hm.entrySet()
                  .stream()
                  .sorted((i1, i2)
                              -> i1.getValue().compareTo(
                                  i2.getValue()))
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1, LinkedHashMap::new));
        return temp;
    }
}