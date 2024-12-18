class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(k, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                // Compare based on the negative of the squared Euclidean distance
                return Integer.compare(distanceSquared(p2), distanceSquared(p1));
            }
        });

        for (int[] point : points) {
            maxHeap.offer(point); 
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }

    private int distanceSquared(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}