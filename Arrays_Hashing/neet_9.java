import java.util.HashSet;

public class neet_9{
    public static void main(String[] args) {
            int[]arr={100,99,-1,-5,4,2,1,3};
            System.out.println(longestconsecutive(arr));
    }
    public static int longestconsecutive(int[]nums){
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> numset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numset.add(nums[i]);
        }
        int longestSub=1;
        for(int num:numset){
            if(numset.contains(num-1)){
                continue;
            }else{
                int currNum=num;
                int currSub=1;
                while (numset.contains(currNum+1)) {
                    currNum++;
                    currSub++;
                }
                longestSub=Math.max(currSub, longestSub);
            }

        }
        return longestSub;
    }
}