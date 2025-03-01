class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0, end = 0, len = weights.length;
        for(int w:weights){
            start = Math.max(w,start);
            end += w;
        }
        if(len == days) return start;
        while(start <= end){
            int mid =  start + (end - start)/2;
            if(split(weights,mid) > days){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return start;
    }
    private int split(int[] weights, int mid){
        int pieces = 1;
        int sum = 0;
        for(int w:weights){
            if(sum + w <= mid){
                sum += w;
            } else{
                pieces++;
                sum = w;
            }
        }
        return pieces;
    }
}