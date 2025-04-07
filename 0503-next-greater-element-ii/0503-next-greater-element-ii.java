class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2 * n - 1; i >= 0; i--){
            int index  = i % n;
            while(!st.empty() && st.peek() <= nums[index]){
                st.pop();
            }
            ans[index] = st.empty() ? -1 : st.peek();
            st.push(nums[index]);
        }
        return ans;
    }
}