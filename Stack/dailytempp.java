
package Stack;

import java.util.Arrays;
import java.util.Stack;

public class dailytempp {

    public static void main(String[] args) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        System.out.println(dailyTemperatures(temperatures));
        // 1,1,4,2,1,1,0,0
        // 0 1 2 3 4 5 6 7
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s1 = new Stack<>();
        int[] res = new int[temperatures.length];
        int k = 0;
        s1.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            while (s1.size()>0 && temperatures[s1.peek()] < temperatures[i]) {
                k = i - s1.peek();
                res[s1.peek()] = k;
                s1.pop();
                System.out.println(Arrays.toString(res));
                }
            s1.push(i);
            System.out.println(s1 + "-->");
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}