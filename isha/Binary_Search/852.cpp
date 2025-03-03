class Solution {
    public:
        int peakIndexInMountainArray(vector<int>& arr) {
            int n=arr.size();
            int start=1;
            int end=n-1;
            int mid;
            while(start<=end){
                 mid=(start+end)/2;
                if(arr[mid]<arr[mid+1]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return start;
        }
    };