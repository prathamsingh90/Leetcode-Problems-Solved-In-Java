class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumber = new ArrayList<>();
        int minElemIndex;
        for(int i=0; i<matrix.length; i++){
            minElemIndex = findMinInRow(matrix[i]);
            boolean ifmaxInColumn = checkMaxInColumn(matrix, i, minElemIndex);
            if (ifmaxInColumn) {
                luckyNumber.add(matrix[i][minElemIndex]);
            }            
        }
        
        return luckyNumber;
    }
    
    public static int findMinInRow(int[]matrix){
        int min = Integer.MAX_VALUE;
        int i;
        int result=-1;
        for(i=0;i<matrix.length; i++){
            if (matrix[i]<min){
                min=matrix[i];
                result=i;
            }
        }
        
        return result;
    }
    
    public static boolean checkMaxInColumn(int[][]matrix, int i, int index){
        boolean result =  true;
        int max = matrix[i][index];
        
        for(int j=0; j<matrix.length; j++){
            if(max<matrix[j][index]){
                result=false;
                break;
            }
        }
        return result;
    }
}