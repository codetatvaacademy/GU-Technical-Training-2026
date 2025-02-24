class Solution {
    public:
        int countNegatives(vector<vector<int>>& grid) {
            int count=0;
           for(auto i : grid){
            int low=0;
            int high=i.size()-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(i[mid]>=0){
                    low= mid+1; //if positive, search right part of the array 
                }else if(i[mid]<0){
                    high=mid-1;  // if negeative, search left part of the array
                }
            }
            count = count +i.size()-low;
           }
           return count;
        }
    };