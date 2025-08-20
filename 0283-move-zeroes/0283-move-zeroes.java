class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0,late = 1, len = nums.length;
        while(late < len){
            if(nums[start] != 0){
                start++;
                late++;
            }
            else{
                if(nums[late] != 0){
                    nums[start++] = nums[late];
                    nums[late] = 0;
                    late++;
                }
                else{
                    late++;
                }
            }
        }
    }
}