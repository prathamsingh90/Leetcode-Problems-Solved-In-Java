class Solution {
    public int maxProduct(int[] nums) {
        int max =nums[0], min =nums[0], result=nums[0];
        
        for(int i=1; i<nums.length; i++){
            
            int temp1 = (max==0?1:max)*nums[i];
            int temp2 = (min==0?1:min)*nums[i];
            
            max = Math.max(temp1, Math.max(temp2, nums[i]));
            min = Math.min(temp1, Math.min(temp2, nums[i]));
            
            result = Math.max(result, max);
        }
        
        return result;
    }
}