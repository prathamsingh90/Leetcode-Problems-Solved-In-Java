class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        
        for(int elem:candies){
            if (elem>max){
              max=elem;  
            }
        }
        
        ArrayList<Boolean> result = new ArrayList<>();
        
        for(int elem:candies){
            result.add((elem+extraCandies)>=max);
        }
        
        return result;
    }
}
