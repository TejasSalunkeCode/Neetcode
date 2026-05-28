package Two_Pointer;

public class container_wth_water {
    public static void main(String[] args) {
        int[]height = {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] heights) {
      int max=0;
      int left=0;
      int area=0;
      int dist=0;
      int right=heights.length-1;

      while (left!=right) {
        max=Math.min(heights[left], heights[right]);
        dist=right-left;
        area=Math.max( max*dist,area);
        if(heights[left]>=heights[right]){
            right--;
        }else{
            left++;
        }
      } 
      return area;

    }
}
