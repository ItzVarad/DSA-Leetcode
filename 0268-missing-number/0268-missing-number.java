class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = len;
        for(int i =0; i<len;i++){
            sum = sum + i - nums[i];
        }
        return sum;
    }
}