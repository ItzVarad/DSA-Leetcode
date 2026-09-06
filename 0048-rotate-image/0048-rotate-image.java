class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length, temp = 0;
        for(int i =0; i< row; i++){
            for(int j = i+1; j< row; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int half = row/2;
        for(int i =0; i< row; i++){
            for(int j = 0; j< half; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][row-j-1];
                matrix[i][row-j-1] = temp;
            }
        }
    }
}