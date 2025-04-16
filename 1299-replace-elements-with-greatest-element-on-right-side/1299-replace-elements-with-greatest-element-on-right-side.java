class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int maxNum  = -1;
        if(len == 1) return new int[] {-1};
        for(int i = len - 1; i >= 0 ; i--){
            int curr = arr[i];
            arr[i] = maxNum;
            if(curr > maxNum){
                maxNum = curr;
            }
        }
        return arr;
    }
}