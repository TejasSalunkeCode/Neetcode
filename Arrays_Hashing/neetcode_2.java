package Arrays_Hashing;
import java.util.Arrays;

public class neetcode_2 {
    public static void main(String[] args) {
        String s = "car", t = "arc";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] ch = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i) - 'a']++;
            System.out.println(Arrays.toString(ch));
            ch[t.charAt(i) - 'a']--;
            System.out.println(Arrays.toString(ch));
        }

        for (int count : ch) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
