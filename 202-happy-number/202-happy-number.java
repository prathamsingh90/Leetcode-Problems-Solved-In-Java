class Solution {
    public boolean isHappy(int n) {
        Set<Integer> sumMap = new HashSet<Integer>();
        
        while(sumMap.add(n)) {
            n = findHappySum(n);
        }
        
        return (n==1?true:false);
        
    }
    
    public static int findHappySum(int n){
        int sum = 0;
        
        while (n>0){
            int val = n%10;
            sum += (val*val);
            n=n/10;
        }
        return sum;
    }
}