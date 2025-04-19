class Solution {
    public int minimumRecolors(String blocks, int k) {
        int len = blocks.length(), curr = 0, ans = Integer.MAX_VALUE;
        int l = 0;
        for(int r = 0; r < len; r++){
            char c = blocks.charAt(r);
            if(k < r - l + 1){
                ans = curr < ans ? curr : ans;
                curr = blocks.charAt(l) == 'W' ? curr - 1: curr; 
                l++;
            }
            if(c == 'W'){
                curr++;
            }
        }
        return curr < ans ? curr : ans;
    }
}