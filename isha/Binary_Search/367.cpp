class Solution {
    public:
        bool isPerfectSquare(int num) {
            int start=1,end=num;
            while(start<=end){
                long long int mid=(start+end)/2;
                long long sqr=mid*mid;
                if(sqr==num){
                    return true;
                }
                else if(sqr<num){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return false;
        }
    };