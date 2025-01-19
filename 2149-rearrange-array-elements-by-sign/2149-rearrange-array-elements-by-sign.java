class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length, o=0,e=0;
        int[] odd = new int[len/2];
        int[] even = new int[len/2];
        for(int num:nums){
            if(num>0) even[e++] = num;
            else odd[o++] = num;
        }
        o=0;
        e=0;
        for(int i = 0;i<len;i++){
            if(i % 2 == 0) nums[i] = even[e++];
            else nums[i] = odd[o++];
        }
        return nums;
    }
}