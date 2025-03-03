class Solution {
    public:
        bool isPerfectSquare(int num) {
            if(num ==1) return true;
    
            int start = 1;
            int end = num/2;
    
            bool isPerfectSquare = false;
    
            while(start<=end){
              int mid = (start+end) / 2;
              long long  val = (long long )mid*mid;
              if(val == num) return true;
    
              if(val > num){
                end = mid - 1;
              }
              else{
                start = mid + 1;
              }
            }
    
            return isPerfectSquare;
            
        }
    };