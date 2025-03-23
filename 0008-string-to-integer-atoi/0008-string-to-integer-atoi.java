class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1, ans = 0, n = s.length();
        while(i < n && s.charAt(i) == ' '){
            i++;
        }
        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }
        return helper(i,ans,s,n,sign);
    }
    private int helper(int i,int ans, String s, int n,int sign){
        if(i >= n || !(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
            return sign * ans;
        }
        int digit = s.charAt(i) - '0';
        int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
        if(ans > (max-digit)/10){
            return sign == 1 ? max : min;
        }
        ans = ans * 10 + digit;
        return helper(i+1,ans,s,n,sign);
    }
}