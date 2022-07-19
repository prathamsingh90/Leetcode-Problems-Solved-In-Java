class Solution {
    public List<Integer> getRow(int rowIndex) {
        List <List<Integer>> mainList = new ArrayList<>();
        
        for(int i=0; i<=rowIndex; i++){
           List<Integer> subList = new ArrayList<>();
           int startValue = 1;
           for(int j=0; j<=i; j++) {
               if (j==0||j==i){
                   subList.add(j,startValue);
               } else {
                   subList.add(j, (mainList.get(i-1).get(j)+mainList.get(i-1).get(j-1)));
               }
           }
           mainList.add(i, new ArrayList<Integer>(subList));
        }
        
        return mainList.get(rowIndex);
    }
}