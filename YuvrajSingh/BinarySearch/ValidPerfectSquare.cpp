class Solution {
    public:
        bool isPerfectSquare(int num) {
            int min = 0;
            int max = num;
            while(min<=max)
            {
                int mid = (min+max)/2;
                long long ans =(long long) mid* mid;
                if(ans == num)
                return true;
                if(ans>num){
                max = mid-1;
                }
                else{
                min = mid+1;
                }
            }
            return false;
        }
    };