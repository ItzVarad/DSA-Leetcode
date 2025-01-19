class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length, pos = 0, neg = 1;
        int[] ans = new int[len];
        for(int i = 0; i<len; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos += 2;
            }
            else{
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }
}