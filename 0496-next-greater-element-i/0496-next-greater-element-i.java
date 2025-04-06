class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a = 0; a < n1; a++){
            map.put(nums1[a],a);
        }
        int[] ans = new int[n1];
        for(int j = n2-1; j >= 0; j--){
            int num2 = nums2[j];
            while(!st.empty() && num2 >= st.peek()){
                st.pop();
            }
            if(map.containsKey(num2)){
                if(st.empty()){
                    ans[map.get(num2)] = -1;
                } else{
                    ans[map.get(num2)] = st.peek();
                }
            }
            st.push(num2);
        }
        return ans;
    }
}