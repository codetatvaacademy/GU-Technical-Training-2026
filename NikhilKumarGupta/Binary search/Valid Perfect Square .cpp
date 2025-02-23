class Solution {
    public:
        bool isPerfectSquare(int num) {
            for(long long i=1;;i++){
                if(i*i==num){
                    return true;
                }
                if(i*i>num){
                    return false;
                }
            }
            return false;
        }
    };