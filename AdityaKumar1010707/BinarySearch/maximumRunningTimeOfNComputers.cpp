class Solution {
    public:
    
        long long findAvail(long val,vector<int> &batt){
            long long sum = 0;
            for(long x:batt){
                if(x>val) {sum+=val;}
                else
                sum+=x;
            }
    
            return sum;
        }
        long long maxRunTime(int n, vector<int>& batt) {
    
           if (batt.empty()) return 0;
           long long cap;
           long long max=0;
    
           long long min = LONG_MAX;
           for(long x: batt){
            min = min>x?x:min;
           }
    
           for(long x:batt){
            max+=x;
           }
            
           while(min<=max){
            long long  mid = (min + max)/2;
         
            long long req = n*mid;
          
            cap = findAvail(mid,batt);
            
            if(cap>=req){
                min = mid+1;
            }
            else{   
                max = mid-1;
            }
           }
           return max;
        }
    };