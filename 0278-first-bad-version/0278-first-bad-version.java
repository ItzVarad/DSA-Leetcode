/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            boolean x = isBadVersion(mid);
            if(x){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}