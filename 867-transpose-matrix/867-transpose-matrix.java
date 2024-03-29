class Solution {
    public int[][] transpose(int[][] matrix) {
    
    int rows = matrix[0].length;
    int columns = matrix.length;
    int[][] transMatrix = new int[rows][columns];
        
    for(int i=0; i<rows; i++){
        for(int j=0; j<columns; j++){
            transMatrix[i][j]=matrix[j][i];
        }
    }
    return transMatrix;
    }
}