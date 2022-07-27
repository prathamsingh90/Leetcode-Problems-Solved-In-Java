class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones=0, totalOnes=0;
        
        for (int num: nums){
            if(num==0){
                ones=0;
            } else {
                ones++;
                totalOnes=Math.max(ones, totalOnes);
            }
        }
        
        return totalOnes;
    }
}