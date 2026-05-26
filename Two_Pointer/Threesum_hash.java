package Two_Pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Threesum_hash {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ansSet = new ArrayList<>();

        Arrays.sort(nums);

        HashSet<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {

            HashSet<Integer> set1 = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int rem = -(nums[i] + nums[j]);

                if (set1.contains(rem)) {

                    List<Integer> subset = new ArrayList<>();

                    subset.add(nums[i]);
                    subset.add(rem);
                    subset.add(nums[j]);

                    Collections.sort(subset);

                    uniqueTriplets.add(subset);
                }

                set1.add(nums[j]);
            }
        }

        ansSet.addAll(uniqueTriplets);

        return ansSet;
    }
}