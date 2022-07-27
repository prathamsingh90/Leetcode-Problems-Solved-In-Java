class Solution {
    public int maxPower(String s) {
        int count=1;
        int maxCount=1;
        char elem = s.charAt(0);
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==elem){
                count++;
                maxCount=Math.max(count, maxCount);
            } else {
                count=1;
                elem = s.charAt(i);
            }
        }
        return maxCount;
    }
}