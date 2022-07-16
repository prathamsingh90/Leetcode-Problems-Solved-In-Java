class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res=0;
        int[] count = new int[101];
        
        for (int i=0; i<nums.length; i++){
            if (count[nums[i]]==0){
                count[nums[i]]=1;
            } else {
                count[nums[i]] +=1;
                res += (count[nums[i]]-1);
            }
        }
        
        return res;
    }
}
