class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0, curr = 0;
        for(int i: nums){
            set.add(i);
        }
        for(int num: set){
            if(!set.contains(num - 1)){
                curr = 1;
                while(set.contains(num+ curr)){
                    curr++;
                }
            }
            max = max > curr ? max : curr;
        }
        return max;
    }
}