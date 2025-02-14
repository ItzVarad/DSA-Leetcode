class Solution {
    public boolean isPerfectSquare(int num) {
        int start =0, mid=0, end = num;
        long n = (long) num;
        while(start <= end){
            mid = start + (end - start)/2;
            long square = (long) mid * mid;
            if(square == n){
                return true;
            } else if(square < num){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return false;
    }
}