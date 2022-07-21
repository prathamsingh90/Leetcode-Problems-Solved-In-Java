class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if ((mat.length==r && mat[0].length==c) || (r*c != (mat.length*(mat[0].length)))) {
            return mat;
        }
        
        int col = mat[0].length;
        int[][] result = new int[r][c];
        
        for(int i=0; i<r*c; i++) {
            result[i/c][i%c] = mat[i/col][i%col];
        }
        return result;
    }
}