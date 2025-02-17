class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length, pointer = 0;
        int arr[] = new int[len];
        k %= len;
        int rotate = (len - k);
        int end = rotate;
        for(int i = rotate;i<len;i++){
            arr[pointer++] = nums[i];
        }
        for(int i = 0;i<end;i++){
            arr[pointer++] = nums[i];
        }
        for(int i = 0;i<len;i++){
            nums[i] = arr[i];
        }
    }
}