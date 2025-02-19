class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        long sum = (len)*(len+1)/2;
        for(int num:nums){
            sum -= num;
        }
        return (int)sum;
    }
}