class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int  start =0 ,end  = len -1, h = 0, area = 0;
        while(start < end){
            h = Math.min(height[start],height[end]);
            area = Math.max(area, (end-start)*h);
            while(start < end && height[start] <= h){
                start++;
            }
            while(start < end && height[end] <= h){
                end--;
            }
        }
        return area;
    }
}