class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0, end = 0, len = nums.length;
        for(int num: nums){
            start = Math.max(start,num);
            end += num;
        }
        if(len == k) return start;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(splits(nums,mid,k)){
                start = mid + 1;
            } else{
                end  = mid - 1;
            }
        }
        return start;
    }
    private boolean splits(int[] nums, int mid, int k){
        int pieces = 1;
        int sum = 0;
        for(int num:nums){
            if(sum + num > mid){
                pieces++;
                if(pieces > k) return true;
                sum = num;
            } else{
                sum += num;
            }
        }
        return false;
    }
}