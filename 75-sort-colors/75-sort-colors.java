class Solution {
    public void sortColors(int[] arr) {
        int low =0;
        int mid=0;
        int high = arr.length-1;
        
        while(mid<=high){
            if (arr[mid]==0){
                swapElem(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid]==1){
                mid++;
            } else if (arr[mid]==2){
                swapElem(arr,mid,high);
                high--;
            }
        }
        
    }
    
    public void swapElem(int[]arr, int ind1, int ind2){
        int temp= arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
}