class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if ((mat.length==r && mat[0].length==c) || (r*c != (mat.length*(mat[0].length)))) {
            return mat;
        }
        
        List<Integer> tempArray = new ArrayList<Integer>(r*c);
        int[][] result = new int[r][c];
        
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++){
                tempArray.add(mat[i][j]);
            }
        }
       
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++){
                result[i][j]=tempArray.get(i*c+j);
            }
        }      
        return result;
    }
}