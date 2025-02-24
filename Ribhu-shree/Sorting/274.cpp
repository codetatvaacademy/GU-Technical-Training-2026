class Solution {
    public:
        int hIndex(vector<int>& citations) {
            sort(citations.begin(),citations.end());
            int H=0;
            for(int i=0 ;i< citations.size();i++){
                int x=citations.size()-i;
                if(citations[i]>= x){
                    H = x;
                    break;
                }
    
            }
            return H;
        }
    };