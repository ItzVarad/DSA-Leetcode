class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = k-1, res = Integer.MAX_VALUE, len = nums.length;
        while(r < len){
            int diff = nums[r] - nums[l]; 
            res = diff > res ? res : diff;
            l++;
            r++;
        }
        return res;
    }
}