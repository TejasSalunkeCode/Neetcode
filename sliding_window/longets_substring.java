package sliding_window;

import java.util.HashSet;

public class longets_substring {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int left=0;
        int right=1;
        int ans=0;

        HashSet<Character> set = new HashSet<>();
                set.add(s.charAt(0));

        while (right<s.length()) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans=Math.max(ans, right-left+1);
            right++;
        }
        return ans;
      
    }
}
