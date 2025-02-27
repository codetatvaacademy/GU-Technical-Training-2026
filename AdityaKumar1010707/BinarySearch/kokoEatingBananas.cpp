class Solution {
    public:
    
        long long NoOfHoursWithEatingSpeed(int speed, vector<int>& piles){
          
         long long hours = 0;
         int s = piles.size();
         for(int i=0;i<s;i++){
              
            int rem = piles[i] % speed;
            if(rem == 0){
                hours+=piles[i]/speed;
            }
            else{
                if(piles[i] > speed) {
                    hours+= piles[i] / speed;
                    hours++;
                }
                else{
                    hours++;
                }
                  
            }
    
         }
    
         return hours;
    
        }
        
    
        int minEatingSpeed(vector<int>& piles, int h) {
    
            int max_time =1;
            int min_time =1;
    
            int size = piles.size();
            
            for(int i=0;i<size;i++){
    
                min_time  = max(min_time,piles[i]);
    
            }
    
            int l = 1;
            int r = min_time;
            int answer = min_time;
    
            // while(l<=r){
    
            //     int middle = (r-l)/2;
    
            //     if(NoOfHoursWithEatingSpeed(middle,piles) <= h){
            //         answer =  middle;
            //          r = middle-1;
            //     }
            //     else{
            //         l = middle+1;
            //     }
    
            // }
    
            
            while(l <= r) {
                int middle = l + (r - l) / 2;
    
                if(NoOfHoursWithEatingSpeed(middle, piles) <= h) {
                    answer = middle;
                    r = middle - 1;
                } else {
                    l = middle + 1;
                }
            }
    
    
            return answer;
            
        }
    };