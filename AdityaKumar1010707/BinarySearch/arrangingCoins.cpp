class Solution {
    public:
    
        long long funct(long long  num){
            return num*(num+1)/2;
        }
    
    
        int arrangeCoins(int n) {
    
            long long  start = 1;
            long long  end = n;
    
            while(start<=end){
                long long mid = (start+end)/2;
    
                long long  val = funct(mid);
                if(val==n) return mid;
                else if(val>n){
                    end = mid-1;
                } 
                else{
                    start = mid +1;
                }
            }
    
            return start-1;
    
            
            
        }
    };