class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max_so_far=0, pos_max=0, neg_max=0;
        for(int i=0; i<nums.length; i++){
             pos_max+=nums[i];
             neg_max+= nums[i];
            
             max_so_far = Math.max(Math.abs(max_so_far), pos_max);
             max_so_far = Math.max(Math.abs(max_so_far), Math.abs(neg_max));
            
             if(pos_max<0){
                 pos_max=0;
             }
            
             if(neg_max>0){
                 neg_max=0;
             }
    }
        return max_so_far;
    }
}