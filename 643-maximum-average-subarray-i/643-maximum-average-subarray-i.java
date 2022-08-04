class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = 0.0;
        double max_average = Double.MIN_VALUE;
        int sum=0;
        
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        
        average=((double)sum/(double)k);
        max_average=average;
        
        for(int i=k; i<nums.length; i++){
            average=((((average*(double)k))+((double)nums[i])-((double)nums[i-k]))/(double)k);
            max_average = Math.max(max_average, average);
        }
        
        return max_average;
    }
}