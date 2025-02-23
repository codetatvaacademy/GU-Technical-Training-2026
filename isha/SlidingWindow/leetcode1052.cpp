class Solution {
    public:
        int maxSatisfied(vector<int>& customers, vector<int>& grumpy, int minutes) {
            int strat=0;
            int satisfied=0;
            int additionalSatisfied=0;
            int  maxAdditionalSatisfied=0;
            int n=customers.size();
            for(int i=0;i<n;i++){
                if(grumpy[i]==0){
                    satisfied+=customers[i];
                }
            }
            for(int i=0;i<n;i++){
                if(grumpy[i]==1){
                   additionalSatisfied+=customers[i];
                }
                if(i>=minutes && grumpy[i-minutes]==1){
                    additionalSatisfied-=customers[i-minutes];
                }
                maxAdditionalSatisfied = max(maxAdditionalSatisfied, additionalSatisfied);
            }
    
            return satisfied + maxAdditionalSatisfied;
            
            
        }
    };