class Solution {
    private:
    bool isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
public:
    vector<int> vowelStrings(vector<string>& words, vector<vector<int>>& queries) {
        vector<int> prefixSum(words.size(),0);
        vector<int> ans(queries.size(),0);
        int count=0;
        for(int i=0;i<words.size();i++){
            if(isVowel(words[i].front()) && isVowel(words[i].back())){
                count++;
            }
            prefixSum[i]=count;
        }
        for(int i=0;i<queries.size();i++){
            int start=queries[i][0];
            int end=queries[i][1];
             ans[i]= prefixSum[end]-(start>0 ? prefixSum[start-1] : 0  );
        }
       return ans; 
    }
};