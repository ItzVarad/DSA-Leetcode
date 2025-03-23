class Solution {
    public int countGoodNumbers(long n) {
        long MOD = 1000000007;
        long even = n /2;
        if(n % 2 == 1){
            even++;
        }
        long odd = n /2;
        return (int) (pow(5,even,MOD)*pow(4,odd,MOD)% MOD);
    }
    private long pow(long x, long y, long MOD){
        if(x == 1 || y == 0){
            return 1;
        }
        if(y == 1){
            return x;
        }
        long result = pow(x,y/2,MOD);
        return y % 2 == 0 ? (result * result) % MOD : (result * result * x) % MOD;
    } 
}