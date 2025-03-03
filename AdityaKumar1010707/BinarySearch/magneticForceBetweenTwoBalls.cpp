class Solution {
    public:
    
        bool isValid(int dist, vector<int>&arr, int m ){
           //Put the first ball in the first container
           int lastBallPos = arr[0];
           m--;
    
           for(int i=1;i<arr.size();i++){
            if(arr[i]-lastBallPos >= dist){
                m--;
                lastBallPos = arr[i];
            }
           }
           return m<=0;
        }
    
        int maxDistance(vector<int>& position, int m) {
            
            //Sort the array
            sort(position.begin(),position.end());
    
            int min  = 1;
            int max  = position[position.size()-1] - min;
        
            
    
            while(min<=max){
                int mid = (min+max)/2;
                if(isValid(mid,position,m)){
                 min = mid+1;
                }
                else{
                max = mid-1;
    
                }
            }
            return max;
            
        }
    };