class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> sum = new LinkedList<Integer>();
        
        for(int i=num.length-1; i>=0 || k>0; i--){
             sum.add(0,((i>=0)?num[i]+k:k)%10);
             k = ((i>=0)?(num[i]+k):k)/10;
        
        }
        return sum;
    }
}