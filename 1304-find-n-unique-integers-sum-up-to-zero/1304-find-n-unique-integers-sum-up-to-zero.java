class Solution {
    public int[] sumZero(int n) {
        int start=0, end=n-1, baseValue=1;
        int[] zeroSum = new int[n];
        
        if (n%2!=0){
            zeroSum[(int)(Math.floor(n/2))] = 0;
        }
        
        while(end>start){
            zeroSum[start++]=(-1)*baseValue;
            zeroSum[end--] = baseValue;
            baseValue++;
        }
        
        return zeroSum;
    }
}