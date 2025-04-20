class Solution {
    public int[] finalPrices(int[] prices) {
        int len = prices.length, top = -1;
        int[] ans = new int[len];
        int[] stack = new int[len];
        for(int i = len -1; i >= 0; i--){
            int num = prices[i];
            while(top > -1 && stack[top] > num){
                stack[top] = 0;
                top--;
            }
            if(top == -1){
                ans[i] = prices[i];
            } else{
                ans[i] = prices[i] - stack[top];
            }
            stack[++top] = num;
        }
        return ans;
    }
}