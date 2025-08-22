class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 2, len = nums.length ;
        for(int i = 2; i < len; i++){
            if(nums[i] > nums[pointer - 2]){                
                nums[pointer++] = nums[i];
            }
        }
        return pointer;
    }
}