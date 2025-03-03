class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int start=0;
        int end=0;
        int unsatisfied=0;
        int maxUnsatisfied=0;
        int satisfied=0;
        while(end<customers.length){
            if((end-start)+1>minutes){
                if(grumpy[start]==1){
                    unsatisfied-=customers[start];
                }
                start++;
            }
            else{
                if(grumpy[end]==1){
                    unsatisfied+=customers[end];
                    end++;
                }
                else{
                    satisfied+=customers[end];
                    end++;
                }
            }
            if(unsatisfied>maxUnsatisfied){
                maxUnsatisfied=unsatisfied;
            }
        }
        return maxUnsatisfied+satisfied;
    }
}
