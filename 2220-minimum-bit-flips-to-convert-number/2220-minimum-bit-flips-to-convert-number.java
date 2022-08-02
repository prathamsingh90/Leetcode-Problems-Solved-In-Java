class Solution {
    public int minBitFlips(int start, int goal) {
        
        int count=0;
        int value=start^goal;
        
        while(value>0){
            count++;
            value=value&(value-1);
        }
      return count;  
    }
}