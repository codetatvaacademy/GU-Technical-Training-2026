class Solution {
    public:
        int arrangeCoins(int n) {
            int start = 0;
            int end = n;
            long mid, curr;
            while(start<=end)
            {
                mid = (start+end) /2;
                curr = mid*(mid+1)/2;
                if(curr == n)
                return mid;
                if(n<curr)
                end = mid-1;
                else
                start = mid+1;
            }
            return(int)end;
        }
    };