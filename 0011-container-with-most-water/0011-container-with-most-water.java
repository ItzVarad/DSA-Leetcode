class Solution {
    public int maxArea(int[] height) {
        int len = height.length, width = 0, area = 0, currArea = 0;
        int start = 0, end = len -1;
        while(start < end){
            width = end - start;
            currArea = Math.min(height[start],height[end]) * width;
            if(currArea > area) area = currArea;
            if(height[start] > height[end]){
                end--;
            } else{
                start++;
            }
        }
        return area;
    }
}