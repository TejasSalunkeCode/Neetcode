package Stack;

import java.util.Stack;

public class largest_rect_histo {
    public static void main(String[] args) {
        int[] heights = {7,1,7,2,2,4};
        System.out.println(largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int[] heights) {
        int maxArea=0;
        Stack<Integer> stack = new Stack<>();
        int n=heights.length;

        for (int i = 0; i <= n; i++) {
            int cureentHeight = (i==n) ? 0 : heights[i];
            System.out.println(cureentHeight+"<-----height");
            while (!stack.isEmpty() && cureentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i-stack.peek()-1;
                System.out.println(stack+"-->stackk");
                System.out.println(height+"<---heig");
                System.out.println(width+"<----width");
                maxArea=Math.max(maxArea, height*width);
                System.out.println(maxArea);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
