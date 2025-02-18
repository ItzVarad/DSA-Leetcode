class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        reverseArr(nums,0,len-k-1);
        reverseArr(nums,len-k,len-1);
        reverseArr(nums,0,len-1);
    }
    private void reverseArr(int[] arr, int start,int end){
        while(start <= end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}