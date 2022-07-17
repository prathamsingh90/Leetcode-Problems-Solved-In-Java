class Solution {
    public int diagonalSum(int[][] mat) {
        int maxRow = mat.length;
        int diagSum=0;
        
        for(int i=0; i<maxRow; i++){
            diagSum += mat[i][i];
            diagSum += mat[i][maxRow-i-1];
        }
        
        return (maxRow%2==0)?diagSum:diagSum-(mat[maxRow/2][maxRow/2]);
    }
}
