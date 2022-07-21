class Solution {
    public boolean isHappy(int n) {
        int slow=n, fast=n;
        
        do {
            slow = findHappySum(slow);
            fast = findHappySum(fast);
            fast = findHappySum(fast);
        } while(slow!=fast);
        
        return (slow==1?true:false);
        
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