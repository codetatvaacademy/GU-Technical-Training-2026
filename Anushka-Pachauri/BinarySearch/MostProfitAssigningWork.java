class MostProfitAssigningWork {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxDiff=0;
        int answer=0;
        for(int diff : difficulty){
            if(diff>maxDiff){
                maxDiff=diff;
            }
        }
        int[] prefixMax=new int[maxDiff+1];
        for(int i=0;i<difficulty.length;i++){
            prefixMax[difficulty[i]]=Math.max(profit[i],prefixMax[difficulty[i]]);
        }
        for(int i=1;i<maxDiff+1;i++){
            prefixMax[i]=Math.max(prefixMax[i],prefixMax[i-1]);
        }
        for(int i=0;i<worker.length;i++){
            if(worker[i]>maxDiff){
                answer+=prefixMax[maxDiff];
            }
            else{
                answer+=prefixMax[worker[i]];
            }
        }
        return answer;
    }
}