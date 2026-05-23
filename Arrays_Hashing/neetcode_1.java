// package Arrays_Hashing;
import java.util.HashSet;

public class neetcode_1 {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 8, 9, 3 };
        System.out.println(containDuplicate(arr));
    }

    public static boolean containDuplicate(int[] nums) {
        HashSet<Integer> seennumbers = new HashSet<>();
        for(int num : nums){
            if(seennumbers.contains(num)){
                return true;
            }
            seennumbers.add(num);
        }
        return false;
    }
}