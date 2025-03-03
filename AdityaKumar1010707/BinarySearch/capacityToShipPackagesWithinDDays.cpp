class Solution {
    public:
        bool checkIfPossible(int weight, vector<int> weights, int days) {
    
            int totalDays = 1;
            int sum = 0;
            for (int i = 0; i < weights.size(); i++) {
    
                if (weights[i] > weight) {
                return false;
                }
                else if(sum+weights[i] <= weight){
                    sum += weights[i];
                }
                else{
                totalDays++;
                sum = weights[i];
                }
    
            
            }
            // cout<<totalDays<<" days for " <<weight<<endl;
            return totalDays<=days;
        }
    
        int shipWithinDays(vector<int>& weights, int days) {
    
            int total = 0;
            for (int i = 0; i < weights.size(); i++) {
                total += weights[i];
            }
    
            // int minW = total / days +1;
            int min = 1;
    
            int max = total;
    
    
            while(min<max){
                int capacity = min + (max-min)/2;
                if(checkIfPossible(capacity ,weights, days)){
                    max = capacity;
                }
                else
                min = capacity + 1;
            }
    
            return min;
        }
    };