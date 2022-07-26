class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0], result=0;
        
        for(int i=1; i<arr.length; i++){
            if((arr[i]-min)>0){
                result+=arr[i]-min;
            }
            
            min=arr[i];
        }
        
        return result;
    }
}