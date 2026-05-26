package Two_Pointer;

import java.util.Arrays;

public class twoPointer_Binay {
   public static void main(String[] args) {
        int[]arr={2,4,6,7,9,11,18,25};
        int target=10;
        int[]res=twosum(arr, target);
        System.out.println(Arrays.toString(res));
    }
   public static int[] twosum(int[]arr,int target){
    int rem=0;
        for (int i = 0; i < arr.length; i++) {
            rem=target-arr[i];
            int left=i+1;
            int right=arr.length-1;
            int mid = left + (right - left) / 2;
            int pass=target;
            int ans=Binary(left, right,mid,arr,rem);
            if(ans!=-1){
                return new int[]{i+1,ans+1};
                // break;
            }
            System.out.println("counting");
        }  
        return new int[]{-1,-1};
    }
    public static int Binary(int left,int right,int mid,int[]arr,int rem){
        while (left<=right) {
            if(arr[mid]==rem){
                return mid;
            }
            else if(arr[mid]>rem){
                right=mid-1;
            }else{
                left=mid+1;
            }
         mid = left + (right - left) / 2;
            System.out.println("helllo");
        }
        return -1;
    }
    
}