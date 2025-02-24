class Solution {
    public:
        int equalSubstring(string s, string t, int maxCost) {
            int left=0,right=0,n=s.size();
            int max_length=0,cost=0;
        
            while(right<n){
                cost = cost +abs(s[right]-t[right]);
                while(cost>maxCost){
                    cost=cost-abs(s[left]-t[left]);
                    left++;
                }
    
                max_length =max(max_length,right- left+1);
                right++;
    
    
            }
            return max_length;
        }
    };