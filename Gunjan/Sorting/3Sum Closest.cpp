class Solution {
public:
    int threeSumClosest(vector<int>& arr, int t) {
        ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
        int diff=INT_MAX,ans=0,n=arr.size();
        if(n==3) return arr[0]+arr[1]+arr[2];
        sort(arr.begin(),arr.end());
        int j=1,k=n-1;
        for(int i=0;i<n-2;i++){
            j=i+1,k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                int x=abs(t-sum);
                if(x==0) return t;
                if(x<diff){
                    diff=x;
                    ans=sum;
                }
                if(sum<t) j++; 
                else k--; 
            }
        }
        return ans;
    }
};
