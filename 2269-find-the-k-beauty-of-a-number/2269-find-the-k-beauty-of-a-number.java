class Solution {
    public int divisorSubstrings(int num, int k) {
        int count =0;
        String number = String.valueOf(num);
        
        for(int i=0; i<number.length()-k+1; i++){
            String temp=number.substring(i, i+k);
            
            int value = Integer.valueOf(temp);
            if(value==0){
                continue;
            } else {
                if(num%value==0){
                    count++;
                }
            }
        }
        
        return count;
    }
}