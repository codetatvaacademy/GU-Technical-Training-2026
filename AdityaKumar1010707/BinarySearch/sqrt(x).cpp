class Solution {
    public:
        int mySqrt(int x) {
    
            if(x<2) return x;
    
            int start = 0;
            int end = x/2;
    
            while(start<=end){
                int mid = (start+end)/2;
    
                long long  val = (long long)mid*mid;
    
                if(val == x){
                    return mid;
                }
    
                else if(val < x ){
                    start = mid+1;
                }
    
                else{
                    end = mid-1;
                }
            }
    
            return end;
            
        }
    };