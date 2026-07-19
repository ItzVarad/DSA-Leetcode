class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int num = 0, count = 0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() > count){
                count = entry.getValue();
                num = entry.getKey();
            }
        }
        return num;
    }
}