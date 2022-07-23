class Solution {
    public int[] productExceptSelf(int[] nums) {

        int zeroCount=0;
        
        for(int i=0; i<nums.length; i++){
            if (nums[i]==0) {
                zeroCount++;
            }
            
            if (zeroCount>1){
                return (new int[nums.length]);
            }
        }
        
        
        
        int[] result = new int[nums.length];
        
        result[0]=1;
        
        for(int i=1; i<nums.length; i++){
            result[i]=result[i-1]*nums[i-1];
        }
        
        int right=1;
        
        for(int i=nums.length-1; i>=0; i--){
            result[i]*=right;
            right*=nums[i];
        }
        
        return result;
    }
}