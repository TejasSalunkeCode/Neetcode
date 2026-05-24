import java.util.Arrays;

public class neetcode_7 {
    public static void main(String[] args) {
        int[] nums = { 2,3,4,5 };
                     //24 12 8 6
        int answ[] = productExceptSelf(nums);
        System.out.println(Arrays.toString(answ));
    }
    // 48,24,12,8
    // 0,-6,0,0,0
    public static int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        int pref=1;
        int post=1;

        for (int i = 1; i < ans.length; i++) {
            ans[i]=pref*nums[i-1];
            pref=ans[i];
        }
System.out.println(Arrays.toString(ans));
        for (int i = ans.length-2; i >=0; i--) {
            post=nums[i+1]*post;       
        ans[i]=ans[i]*post;
        // ans[i]=
        }

        return ans;
    }
}
