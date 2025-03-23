class Solution {
    public double myPow(double x, int n) {
        return n > 0 ? recursion(x,n) : 1 / recursion(x,n);
    }
    private double recursion(double x, int n){
        if(x == 1 || n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        double ans = recursion(x,n/2);
        return n % 2 == 0 ? ans * ans : ans * ans * x;
    }
}