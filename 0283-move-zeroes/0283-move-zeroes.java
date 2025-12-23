class Solution {
    public void moveZeroes(int[] nums) {
        int front = 0, len = nums.length, x = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] != 0){
                x = nums[i];
                nums[i] = nums[front];
                nums[front] = x;
                front++;
            }
        }
    }
}