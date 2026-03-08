import java.util.Arrays;

public class neetcode_7 {
    public static void main(String[] args) {
        int[] nums = { 0, 8, 0 };
        int answ[] = productExceptSelf(nums);
        System.out.println(Arrays.toString(answ));
    }

    // 48,24,12,8
    // 0,-6,0,0,0
    public static int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];
        int sum = 1;
        int cnt = 0, cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                sum = sum * nums[i];
                cnt2++;
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);
        for (int i = 0; i < ans.length; i++) {
            if (cnt >= 2) {
                ans[i] = 0;
            } else if (cnt >= 1 && nums[i] != 0) {
                ans[i] = 0;
            } else if (cnt >= 1 && nums[i] == 0 && cnt2 >= 1) {
                ans[i] = sum;
            } else if (cnt >= 1 && nums[i] == 0 && sum == 1) {
                ans[i] = 0;
            } else {
                ans[i] = sum / nums[i];
            }
            System.out.println(Arrays.toString(ans));
        }
        System.out.println(sum);
        return ans;
    }
}
