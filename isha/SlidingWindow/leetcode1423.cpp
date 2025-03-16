class Solution {
    public:
        int maxScore(vector<int>& cardPoints, int k) {
            int currentSum=0;
            int n=cardPoints.size();
            int maxS=0;
            for(int i=0;i<k;i++){
                currentSum+=cardPoints[i];
            }
            maxS=currentSum;
            for(int i=0;i<k;i++){
                currentSum=currentSum-cardPoints[k-1-i]+cardPoints[n-1-i];
                
            }
            maxS=max(currentSum,maxS);
            return maxS;
        }
    };