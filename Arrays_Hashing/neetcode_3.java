// package Arrays_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class neetcode_3 {
    public static void main(String[] args) {
        int nums[] = {4,8,2,10,7};
        int target = 9;
        int[] res = twosum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twosum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}
