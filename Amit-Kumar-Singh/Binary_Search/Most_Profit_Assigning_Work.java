class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[][] processArray = new int[difficulty.length][2];
        for(int i=0;i<difficulty.length;i++){
            processArray[i][0] = difficulty[i];
            processArray[i][1] = profit[i];
        }
        Arrays.sort(processArray, Comparator.comparingInt(a -> a[0]));
        for(int i=0;i<processArray.length;i++){
            difficulty[i] = processArray[i][0];
            if(i==0){
                profit[i] = processArray[i][1];
            }
            else{
                profit[i] = Math.max(processArray[i][1],profit[i-1]);
            }
        }
        int result = 0,j=0;
        Arrays.sort(worker);
        for(int i = 0;i<worker.length;i++){
            while(j<difficulty.length && difficulty[j]<=worker[i]){
                j++;
            }
            if(j>0){
                result += profit[j-1];
            }
        }
        return result;
    }
}