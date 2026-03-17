package Two_Pointer;

public class container_wth_water {
    public static void main(String[] args) {
        int[]height = {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] heights) {
      int max=0;
      int left=0;
      int right=heights.length-1;
      while (left<right) {
        int width=right-left;
        int area=Math.min(heights[left], heights[right])*width;
        max=Math.max(max, area);
        if(heights[left]<=heights[right]){
            left++;
        }else{
            right--;
        }
      }
      return max;
    }
}
