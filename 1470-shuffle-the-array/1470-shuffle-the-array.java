class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        int start = 0, prev = 0;
        while(n < len){
            ans[prev++] = nums[start++];
            ans[prev++] = nums[n++]; 
        }
        return ans;
    }
}