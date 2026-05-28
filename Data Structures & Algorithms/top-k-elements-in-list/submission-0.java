class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        // Store frequency
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Max Heap
        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        // Add all numbers into heap
        pq.addAll(map.keySet());

        // Result array
        int[] result = new int[k];

        // Get top k frequent elements
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}