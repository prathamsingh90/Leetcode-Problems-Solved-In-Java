class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        for (int i=n; i<nums.length; i++) {
            nums[i]=(nums[i]<<10)|nums[i-n];
        }
        
        int index = 0;
        
        for (int i=n; i<nums.length; i++, index+=2) {
            nums[index]=nums[i]&1023;
            nums[index+1]=nums[i]>>10;
        }
        
        return nums;
    }
}
