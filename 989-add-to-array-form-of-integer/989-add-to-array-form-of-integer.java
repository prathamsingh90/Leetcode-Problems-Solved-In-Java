class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> sum = new LinkedList<Integer>();
        
        for(int i=num.length-1; i>=0; i--){
             if (k>0) {
             sum.add(0,(num[i]+k)%10);
             k = (num[i]+k)/10;
             } else {
             sum.add(0, num[i]);
             }
        }
        
        while (k>0){
            sum.add(0, k%10);
            k/=10;
        }
        
        return sum;
    }
}