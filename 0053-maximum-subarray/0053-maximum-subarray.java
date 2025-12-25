class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, len = nums.length;
        for(int i=0; i < len; i++){
            int sum = 0;
            for(int j = i; j < len; j++){
                sum += nums[j];
                maxSum = sum > maxSum ? sum : maxSum;
            }
        }
        return maxSum;
    }
}