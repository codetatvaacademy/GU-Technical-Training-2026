class Solution {
    public:
        bool judgeSquareSum(int c) {
    
    
            int left=0;
            int right=sqrt(c);
            while(left<=right){
    
                long long leftSquareVal = (long long)left*left;
                long long rightSquareVal = (long long)right*right;
    
    
                long long val=leftSquareVal + rightSquareVal;
    
                if(val==c)return true;
                else if(val>c)right--;
                else  left++;
    
            }
    
            return false;
            
        }
    };