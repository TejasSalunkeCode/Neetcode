import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class neetcode_5 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 3, 3 };
        int k = 2;

        int[] arr = topFrequent(nums, k);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] topFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        Map<Integer, Integer> count = new HashMap<>();

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        System.out.println(count);

        Queue<Integer> heap = new PriorityQueue<>(
                (a, b) -> count.get(a) - count.get(b));
        // System.out.println(heap.size());
        for (int n : count.keySet()) {
            heap.add(n);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }

        return ans;
    }
}
