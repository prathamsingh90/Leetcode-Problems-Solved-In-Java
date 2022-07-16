class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.toCharArray().length < 26) {
            return false;
        }
        
        int pangram = (1<<26)-1;
        int charCounter = 0;
        
        for(char ch:sentence.toCharArray()){
            charCounter|=(1<<(ch-'a'));
            
            if(pangram==charCounter){
                return true;
            }
        }
        
        return false;
    }
}
