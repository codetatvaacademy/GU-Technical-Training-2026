class Solution {
    public:
        int numOfSubarrays(vector<int>& arr, int k, int threshold) {
            int count=0;
            int sum=0;
            int avg=INT_MAX;
            // For first window
            for(int i = 0;i<k;i++){
                sum += arr[i];
            }
             avg = sum/k;
            //For next remaining windows
            if(avg >=threshold) count++;
            for(int i = 1;i<=arr.size()-k;i++){
    
                sum = sum - arr[i-1] + arr[i+k-1];
                avg = sum/k;
                if(avg>=threshold) count++;
    
            }
            return count;
        }
    };