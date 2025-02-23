class Solution {
    public:
        int numOfSubarrays(vector<int>& arr, int k, int threshold) {
    
            int start=0;
            int count=0;
             int sum=0;
             
    
             for(int i=0;i<k;i++){
                sum+=arr[i];
             }
                if(sum/k>=threshold){
                    count++;
                   
                }
                for(int i=k;i<arr.size();i++){
                    sum+=arr[i];
                    sum-=arr[start];
                    start++;
                
    
                if(sum/k>=threshold){
                    count++;
                   
                }
        }
                
             
             return count;
    
    
    
            
        }
    };