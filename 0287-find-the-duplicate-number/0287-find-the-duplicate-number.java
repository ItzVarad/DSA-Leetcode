class Solution {
    public int findDuplicate(int[] nums) {
        // This is one of implementation of loop detection using hare and tortoise pointers
        int tortoise = 0, hare = 0;
        while(true){
            tortoise = nums[tortoise];
            hare  = nums[nums[hare]];
            if(hare == tortoise){
                break;
            }
        }
        tortoise = 0;
        while(tortoise != hare){
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        return tortoise;
    }
}