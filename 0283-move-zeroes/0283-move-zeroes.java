class Solution {
    public void moveZeroes(int[] nums) {
        int front = 0, len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] != 0){
                nums[front++] = nums[i];
                nums[i] = 0;
            }
        }
        for(int j = front; j < len; j++){
            nums[front++] = 0;
        }
    }
}