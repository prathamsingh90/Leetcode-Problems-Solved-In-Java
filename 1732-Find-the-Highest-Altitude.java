class Solution {
    public int largestAltitude(int[] gain) {
        
        int maxAltitude = 0;
        int curAltitude = 0;
        
        for(int i=0; i<gain.length; i++){
            curAltitude += gain[i];
            if (curAltitude>maxAltitude) {
                maxAltitude=curAltitude;
            }               
        }
        
        return maxAltitude;
        
    }
}
