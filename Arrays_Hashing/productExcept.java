import java.util.Arrays;

public class productExcept{
    public static void manin(String[]args){
  int[] nums = { 0, 8, 0 };
        int answ[] = productExceptSelf(nums);
        System.out.println(Arrays.toString(answ));
    }

    // 48,24,12,8
    // 0,-6,0,0,0
    public static int[] productExceptSelf(int[] nums) {
        int[]result=new int[nums.length];
        Arrays.fill(result, 1);
        int prev=1,post=1;
        for (int i = 0; i < result.length; i++) {
            result[i]=prev;
            prev=nums[i]*prev;
        }
        for (int i = nums.length-1; i >=0; i--) {
            result[i]=result[i]*post;
            post=post*nums[i];
        }
        return result;
    }
}
