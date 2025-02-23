class Solution {
    public:
        int maxDistance(vector<int>& position, int m) {
            sort(position.begin(),position.end());
          int n=position.size();
          int force=0;
          int low=0;
          int high=position.back()-position[0];
          while(low<=high){
            int newposition=position[0];
            int balls=1;
            int mid=(low+high)/2;
    
            for(int i=1;i<n;i++){
                if((position[i]-newposition)>=mid){
                    balls++;
                    newposition=position[i];
                }
    
            }
            if(balls>=m){
                force=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
          }
          return force;
          
        }
    };