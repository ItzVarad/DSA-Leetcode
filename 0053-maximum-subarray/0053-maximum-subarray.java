class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, sum = 0, len = nums.length;
        for(int i = 0; i < len; i++){
            sum += nums[i];
            maxSum = sum > maxSum ? sum : maxSum;
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}