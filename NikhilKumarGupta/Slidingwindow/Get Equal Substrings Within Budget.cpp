
class Solution {
    public:
        int equalSubstring(string s, string t, int maxCost) {
            int curr=0;
            int maxi=INT_MIN;
            int start=0;
            
    
            for(int end=0;end<t.size();end++){
                curr+=abs(s[end]-t[end]);
    
                while(curr>maxCost){
                    curr-=abs(s[start]-t[start]);
                    start++;
                }
                maxi=max(maxi,end-start+1);
            }
            return maxi;
    
        }
    };