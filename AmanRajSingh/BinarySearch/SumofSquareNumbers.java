class Solution {
    public boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long )Math.sqrt(c);
        long mid = 0;

        while(start <= end){
            mid = start * start + end * end;
            if(mid == c){
                return true;
            }else if(mid < c) {
               start++;
            }else{
                end--;
            }
        }
        return false;
    }
}