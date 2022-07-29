class Solution {
    public int maxSubarraySumCircular(int[] a) {
        if (a.length==1){
            return a[0];
        }
        
        int totalSum = 0;
        
        // Finding total sum
        for(int elem: a){
            totalSum += elem;
        }
        
        int curr_max=a[0], max_so_far=a[0], curr_min=a[0], min_so_far=a[0];
        
        for(int i=1; i<a.length; i++){
            curr_max=Math.max(a[i], curr_max+a[i]);
            max_so_far=Math.max(max_so_far, curr_max);
            curr_min=Math.min(a[i], curr_min+a[i]);
            min_so_far=Math.min(curr_min, min_so_far);
        }
        
        if(min_so_far==totalSum){
            return max_so_far;
        }
        
        return (Math.max(max_so_far, totalSum-min_so_far));
    }
}