class Solution {
    public:
        int peakIndexInMountainArray(vector<int>& arr) {
    
            int start = 0;
            int end = arr.size()-1;
    
            while(start<=end){
                //find mid
                int mid  = start + (end-start) / 2;
    
                //If mid is first element 
                if(mid==0){
                    if(arr[mid]>arr[mid+1]) return mid;
                    else start = mid+1;
                }
                //If mid is last element
                else if( mid == arr.size()-1){
                    if(arr[mid]>arr[mid-1]) return mid;
                    else end = mid-1;
                }
    
                else{
                    if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
                    else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) start = mid+1;
                    else end=mid-1;
                }
                
              
    
    
            }
    
            return 0;
            
            
        }
    };