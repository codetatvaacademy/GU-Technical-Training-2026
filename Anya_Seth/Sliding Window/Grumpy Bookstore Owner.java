class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i = minutes;
        int unsatisfied = 0;
        for(int j = 0 ; j < i ; j++){
            if(grumpy[j] == 1){
               unsatisfied += customers[j];
            }
        }
        int maxValue = unsatisfied;
        while(i < customers.length){
            if(grumpy[i] == 1){
            unsatisfied += customers[i];
            }
            if(grumpy[i-minutes] == 1){
            unsatisfied -= customers[i - minutes];
            }
            maxValue = Math.max(maxValue, unsatisfied);
            i++;
        }
        int ans = maxValue;
        for(int k = 0; k < customers.length ; k++){
            if(grumpy[k] == 0){
            ans += customers[k];
            }
        }
        return ans;
    }
}
