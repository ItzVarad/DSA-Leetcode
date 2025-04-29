class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len - 1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = 2 * nums[i];
                nums[i+1] = 0;
                i++; 
            }
        }
        int start = 0, late = 1;
        while(late < len){
            if(nums[start] != 0){
                start++;
                late++;
            } else{
                if(nums[late] != 0){
                    nums[start++] = nums[late];
                    nums[late++] = 0;
                } else{
                    late++;
                }
            }
        }
        return nums;
    }
}