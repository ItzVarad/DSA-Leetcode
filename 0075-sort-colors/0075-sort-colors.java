class Solution {
    public void sortColors(int[] nums) {
        int arr[] = new int[3];
        for(int i: nums){
            arr[i]++;
        }
        int p = 0;
        for(int i = 0; i < arr[0]; i++){
            nums[p] = 0;
            p++;
        }
        for(int i = 0; i < arr[1]; i++){
            nums[p++] = 1;
        }
        for(int i = 0; i < arr[2]; i++){
            nums[p++] = 2;
        }
    }
}