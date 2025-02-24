class Solution {
    public:
        int findKthPositive(vector<int>& arr, int k) {
            int s=0;
            int e=arr.size()-1;
            int missing;
            while(s<=e){
                int mid=(s+e)/2;
                 missing=arr[mid]-mid-1;
                if(missing<k) s=mid+1;
                else e=mid-1;
            }
            return s+k;
        }
    };