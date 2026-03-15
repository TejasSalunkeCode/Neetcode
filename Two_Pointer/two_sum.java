 package Two_Pointer;

import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int[]arr={2,4,6,7,9,11,18,25};
        int target=10;
        int[]res=twosum(arr, target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twosum(int[]arr,int target){
        int left=0;
        int right=arr.length-1;
    while (left<right) {
            int sum=arr[left]+arr[right];
            if(sum==target){
                return new int[]{left,right};
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
    }
    return new int[]{-1,-1};
    }
    
}