class Solution {
public:
    int bagOfTokensScore(vector<int>& arr, int p) {
        int count=0,i=0,j=arr.size()-1,ans=0;
        sort(arr.begin(),arr.end());
        while(i<=j){
            if(arr[i]<=p){
                count++;
                ans=max(count,ans);
                p-=arr[i];
                i++;

            }
            else{
                if(count>=1){
                    p+=arr[j];
                    j--;
                    count--;
                }
                else break;
            }
        }
        return ans;
    }
};
