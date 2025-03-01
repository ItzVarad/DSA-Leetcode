class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = maxFind(piles);
        int len = piles.length;
        if(len == h) return max;
        int start = 1, end = max;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(hoursTaken(piles, mid) <= h){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
    private int maxFind(int[] piles){
        int max = piles[0];
        for(int i:piles){
            if(i > max) max = i;
        }
        return max;
    }
    private int hoursTaken(int[] piles, int h){
        int totalHours = 0;
        for(int p:piles){
            totalHours += Math.ceil(1.0 * p / h);
        }
        return totalHours;
    }
}