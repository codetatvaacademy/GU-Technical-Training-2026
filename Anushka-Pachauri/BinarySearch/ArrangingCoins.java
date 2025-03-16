class Solution {
    public int arrangeCoins(int n) {
        long min=1;
        long max=n;
        while(min<=max){
            long mid=(min+max)/2;
            long count=mid*(mid+1)/2;
            if(count==n){
                return (int)mid;
            }
            else if(count>n){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return (int)max;
    }
}