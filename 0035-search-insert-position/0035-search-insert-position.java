class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int start = 0, end = len - 1;
        if(target < nums[0]){
            return 0;
        }
        if(target > nums[end]){
            return len;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return start;
    }
}