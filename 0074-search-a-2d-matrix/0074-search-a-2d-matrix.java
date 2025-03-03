class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowsCount = matrix.length, columnsCount = matrix[0].length;
        int start = 0, end = rowsCount * columnsCount -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int row = mid / columnsCount;
            int column  = mid % columnsCount;
            if(matrix[row][column] == target){
                return true;
            } else if(matrix[row][column] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return false;
    }
}