class Solution {
    public int subarraySum(int[] arr, int sum) {
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
        
        int curr_sum=0;
        int count=0;
        values.put(0,1);
        
        for(int i=0; i<arr.length; i++){
            curr_sum += arr[i];
            if(values.containsKey(curr_sum-sum)){
                count+=values.get(curr_sum-sum);
            }
            
            values.put(curr_sum, values.getOrDefault(curr_sum, 0)+1);
        }
        
        return count;
    }
}