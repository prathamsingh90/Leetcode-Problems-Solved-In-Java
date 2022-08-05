class Solution {
    public int trap(int[] height) {
        int left=0, right=height.length-1, lmax=0, rmax=0, water=0;
        
        while(left<=right){
            if(lmax<=rmax){
                water += Math.max(0, lmax-height[left]);
                lmax= Math.max(lmax, height[left]);
                left++;
            } else {
                water += Math.max(0, rmax-height[right]);
                rmax= Math.max(rmax, height[right]);
                right--;
            }
        }
        return water;
    }
}