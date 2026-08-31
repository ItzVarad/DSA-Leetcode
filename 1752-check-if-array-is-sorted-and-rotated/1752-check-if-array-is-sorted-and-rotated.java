class Solution {
    public boolean check(int[] nums) {
        int drop = 0, len = nums.length;
        for(int i =1; i < len; i++){
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] < nums[i-1]) drop++;
            if(drop > 1) return false;
        }
        if(drop == 1 && nums[0] == nums[len-1]){
            return true;
        }
        else if(drop == 1 && nums[0] < nums[len -1]) return false;
        return true;
    }
}