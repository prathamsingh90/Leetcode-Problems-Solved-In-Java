class Solution {
    public int maximumPopulation(int[][] logs) {
    
        int[] population = new int[2051];
    
    for(int i=0; i<logs.length; i++){
        population[logs[i][0]] +=1;
        population[logs[i][1]] -=1;
    }
    
    int year = 1950;
    int maxPopulation = population[1950];
        
    for(int i=1951; i<population.length; i++){
        population[i]+=population[i-1];
        
        if (population[i]>maxPopulation){
            year=i;
            maxPopulation=population[i];
        }
    }
        
    return year;
    }
}