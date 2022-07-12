class 1281-subtract-the-product-and-sum-of-digits-of-an-integer {
    public int subtractProductAndSum(int n) {
        int product = findProduct(n);
        int sum = findSum(n);
        
        return (product-sum);
    }
    
    static int findProduct(int n) {
        int product = 1;
        
        while(n>0){
            int num = n%10;
            product *= num;
            n=n/10;
        }
        
        return product;
    }
    
    static int findSum(int n) {
        int sum = 0;
        
        while(n>0){
            int num = n%10;
            sum += num;
            n=n/10;
        }
        
        return sum;
    }
}
