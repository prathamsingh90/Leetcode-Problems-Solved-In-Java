class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-k+1; i++){
            min=Math.min(min, nums[i+k-1]-nums[i]);
        }
        
        return min;
    }
}