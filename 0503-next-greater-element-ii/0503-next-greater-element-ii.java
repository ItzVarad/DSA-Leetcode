class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] stack = new int[n];
        int top = -1;
        for(int i = 2 * n - 1; i >= 0; i--){
            int index  = i % n;
            while(top != -1 && stack[top] <= nums[index]){
                top--;
            }
            ans[index] = top == -1 ? -1 : stack[top];
            stack[++top] = nums[index];
        }
        return ans;
    }
}