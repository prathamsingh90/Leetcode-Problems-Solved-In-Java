class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>(), firstIndex = new HashMap<>();
        int degree=0, result=0;
        
        for(int i=0; i<nums.length; i++){
            firstIndex.putIfAbsent(nums[i],i);
            
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
            
            if (degree<count.get(nums[i])){
                degree=count.get(nums[i]);
                result=i-firstIndex.get(nums[i])+1;
            } else if (degree==count.get(nums[i])){
                result = Math.min(result, i-firstIndex.get(nums[i])+1);
            }
        }
        
        return result;
    }
}