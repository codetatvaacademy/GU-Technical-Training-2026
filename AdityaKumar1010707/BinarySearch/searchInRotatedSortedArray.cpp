class Solution {
    public:
        int search(vector<int>& arr, int target) {
          int l = 0;;
          int r = arr.size()-1;
          while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==target) return mid;
            if(arr[l]<=arr[mid]){
                if(arr[l]<=target && target<=arr[mid])
                r = mid-1;
                else{
                    l = mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[r])
                l = mid+1;
                else{
                    r = mid-1;
                }
            }
          }
    
          return -1;
         }
    
      
        };