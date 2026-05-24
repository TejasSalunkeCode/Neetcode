import java.util.ArrayList;
import java.util.List;

public class neetcode_6 {

    public static void main(String[] args) {

        List<String> input = new ArrayList<>();
        input.add("neet");
        input.add("code");
        input.add("love");
        input.add("you");

        String encoded = encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);
    }

    public static String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for (String s : strs) {
            res.append(s.length()).append("#").append(s);
        }

        return res.toString();
    }

    public static List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {

            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));

            String word = s.substring(j + 1, j + 1 + length);
            res.add(word);

            i = j + 1 + length;
        }

        return res;
    }
}