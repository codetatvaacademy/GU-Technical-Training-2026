class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int unsatisfied=0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                unsatisfied+=customers[i];
            }
        }
        int maxUnsatisfied=unsatisfied;
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i]==1){
                unsatisfied+=customers[i];
            }
            if(grumpy[i-minutes]==1){
                unsatisfied-=customers[i];
            }
            maxUnsatisfied=Math.max(maxUnsatisfied,unsatisfied);
        }
        int maxSatisfied=maxUnsatisfied;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                maxSatisfied+=customers[i];
            }
        }
        return maxSatisfied;
    }
}