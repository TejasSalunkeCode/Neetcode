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
      HashSet<Integer> set = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
        set.add(nums[i]);
      }
      int longestseq=1;
      for(int num : set){
        if(set.contains(num-1)){
          continue;
        }else{
          int currentNum=num;
          int currentSeq=1;
          while (set.contains(currentNum+1)) {
            currentNum++;
            currentSeq++;
          }
          longestseq = Math.max(longestseq,currentSeq);
        }
      }
      return longestseq;
    }
  }