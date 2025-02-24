class Solution {
    public:
        vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
            vector<int> c(A.size());
            unordered_map<int,int> map;
            int count=0;
            for(int i = 0 ;i<A.size();i++){
                map[A[i]]++;
                map[B[i]]++;
                if(A[i]==B[i]){
                    count++;
                    c[i]=count;
                    continue;
                }
                if(map[A[i]]==2){
                    count++;
                }
                if(map[B[i]]==2){
                    count++;
                }
                c[i]=count;
            }
            return c;
        }
    };