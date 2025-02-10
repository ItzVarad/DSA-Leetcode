class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans  = new ArrayList<>();
        int max = candies[0];
        for(int candy:candies){
            if(candy > max) max = candy;
        }
        max -= extraCandies;
        for(int candy:candies){
            if(candy >= max){
                ans.add(true);
            } else{
                ans.add(false);
            }
        }
        return ans;
    }
}