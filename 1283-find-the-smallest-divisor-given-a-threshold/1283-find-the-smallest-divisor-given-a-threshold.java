class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int len= nums.length, max = maxArray(nums);
        if(len == threshold) return max;
        int start = 1, end = max;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(totalSum(nums,mid,threshold)){
                end =  mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
    private int maxArray(int[] nums){
        int max = nums[0];
        for(int i:nums){
            if(i > max) max = i;
        }
        return max;
    }
    private boolean totalSum(int[] nums, int div, int k){
        int sum = 0;
        for(int s:nums){
            sum += (s+div-1)/div;
            if(sum > k) return false;
        }
        return true;
    }
}