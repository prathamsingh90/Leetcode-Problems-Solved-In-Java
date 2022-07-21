class Solution {
    public int removeDuplicates(int[] nums) {
        int pos=0;
        
        for(int i=0; i<nums.length; i++){
            if (nums[i]!=nums[pos]) {
                swap(nums, i, pos+1);
                pos++;
                System.out.println(nums[pos]);
            }
        }
        
        return pos+1;
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}