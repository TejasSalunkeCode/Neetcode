// package Arrays_Hashing;
import java.util.Arrays;

public class neetcode_2 {
    public static void main(String[] args) {
        String s = "car", t = "arc";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int charcount[]=new int[26];
        for (int i = 0; i < s.length(); i++) {
            charcount[s.charAt(i)-'a']++;
            charcount[t.charAt(i)-'a']--;
        }
        for(int count : charcount){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
