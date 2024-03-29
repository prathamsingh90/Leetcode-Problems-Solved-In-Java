// With using extra space 

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];   
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

// Without using extra space

class Solution {
    public int[] buildArray(int[] nums) {   
        for(int i=0; i<nums.length; i++){
            nums[i] = (nums.length * (nums[nums[i]]%nums.length)) + nums[i];
        }
        
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]/nums.length;
        }
        
        return nums;
    }
}
