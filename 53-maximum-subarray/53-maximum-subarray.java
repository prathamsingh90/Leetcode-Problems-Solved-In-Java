class Solution {
    public int maxSubArray(int[] nums) {
        int current_max=nums[0], max_so_far=nums[0];
        
        for(int i=1; i<nums.length; i++){
            current_max=Math.max(nums[i], current_max+nums[i]);
            max_so_far=Math.max(current_max, max_so_far);
        }
        
        return max_so_far;
    }
}