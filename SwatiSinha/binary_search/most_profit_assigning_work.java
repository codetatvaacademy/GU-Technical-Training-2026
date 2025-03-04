class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxLen=0;
        int answer=0;
        for(int num:difficulty){
            maxLen=Math.max(num, maxLen);
        }
        int[] result= new int[maxLen+1];
        for(int i=0; i<difficulty.length; i++){
            result[difficulty[i]]=Math.max(profit[i], result[difficulty[i]]);
        }
        for(int i=1; i<result.length; i++){
            result[i]=Math.max(result[i-1], result[i]);
        }
        for(int i=0; i<worker.length;i++){
            if(worker[i]>maxLen){
                answer+=result[maxLen];
            }else{
                answer+=result[worker[i]];
            }
        }
        return answer;
    }
}