class Solution {
    public int majorityElement(int[] nums) {
        int max  = 0, max_num = 0;
        for(int num: nums){
            if(max == 0){
                max_num = num;
                max++;
            }
            else if(num == max_num){
                max++;
            }
            else{
                max--;
            }
        }
        return max_num;
        
    }
}