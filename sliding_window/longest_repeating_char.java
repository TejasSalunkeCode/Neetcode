package sliding_window;

import java.util.Arrays;

public class longest_repeating_char {

    public static void main(String[] args) {

        String s = "ABAB";
        int k = 0;

        System.out.println(characterReplacement(s, k));
    }

    public static int characterReplacement(String str, int k) {

        int[] arr = new int[26];

        String s = str.toLowerCase();

        Arrays.fill(arr, 0);

        int left = 0;
        int ans = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            // add current character
            arr[s.charAt(right) - 'a']++;

            // maintain max frequency
            max = Math.max(max,
                    arr[s.charAt(right) - 'a']);

            // if window becomes invalid
            while ((right - left + 1) - max > k) {

                arr[s.charAt(left) - 'a']--;

                left++;
            }

            // update answer
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}