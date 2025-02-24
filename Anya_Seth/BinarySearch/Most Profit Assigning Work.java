class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int sum  = 0;
        int max = 0;
        for(int i = 0 ; i < difficulty.length ; i++){
            if(max < difficulty[i]){
                max = difficulty[i];
            }
        }
        int[] prefixMax = new int[max + 1];
        for(int i = 0 ; i < difficulty.length ; i++){
            prefixMax[difficulty[i]] = Math.max(profit[i],prefixMax[difficulty[i]]);
        }
        for(int i = 1 ; i < prefixMax.length ; i++){
            prefixMax[i] = Math.max(prefixMax[i],prefixMax[i-1]);
        }
        for(int i = 0 ; i < worker.length ; i++){
            if(worker[i]>max){
              sum += prefixMax[max];
            }
            else{
              sum += prefixMax[worker[i]];
            } 
           }
        return sum;
    }
}
