class Solution {
    public:
        int largestAltitude(vector<int>& gain) {
            vector<int> PrefixS(gain.size()+1,0);
            for(int i=1;i<gain.size();i++){
                PrefixS[i]=PrefixS[i-1]+gain[i-1];
            }
            return *max_element(PrefixS.begin(),PrefixS.end());
        }
    };