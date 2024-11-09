class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, ans = 0;
        int target = k * threshold; // maths B-)
        for (int i = 0; i < k; i++) sum += arr[i];

        if (sum >= target) ans++;
       
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i-k];
            if (sum >= target) ans++;
        }

        return ans;
    }
}