class Solution {
    public:
        int maxProfitAssignment(vector<int>& difficulty, vector<int>& profit, vector<int>& worker) {
            //Take a pair for storing difficulty and profit
            vector<pair<int, int>> difficultyProfit;
    
            // Store (difficulty, profit) pairs
            for (int i = 0; i < difficulty.size(); i++) {
                difficultyProfit.emplace_back(difficulty[i], profit[i]);
            }
    
            // Sort jobs by difficulty
            sort(difficultyProfit.begin(), difficultyProfit.end());
    
            // Sort workers by their skill level
            sort(worker.begin(), worker.end());
    
            // Precompute max profit for each difficulty
            int maxProfitSoFar = 0;
            for (int i = 0; i < difficultyProfit.size(); i++) {
                maxProfitSoFar = max(maxProfitSoFar, difficultyProfit[i].second);
                difficultyProfit[i].second = maxProfitSoFar;
                
            }
    
            int totalProfit = 0;
            int jobIndex = 0;
            int bestProfit = 0;
    
            for (int skill : worker) {
                while (jobIndex < difficultyProfit.size() && difficultyProfit[jobIndex].first <= skill) {
                    bestProfit = difficultyProfit[jobIndex].second;
                    jobIndex++;
                }
                totalProfit += bestProfit;
            }
    
            return totalProfit;
        }
    };
    