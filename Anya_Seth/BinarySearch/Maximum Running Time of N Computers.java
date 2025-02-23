class Solution {
    public long maxRunTime(int n, int[] batteries){
        long m = batteries.length;
        long min = batteries[0];
        for(int i = 0 ; i < m ; i++){
            if(min>batteries[i]){
                min = batteries[i];
            }
        }
        long max = 0 ;
        for(int i = 0 ; i < m ; i++){
            max += batteries[i];
        }
        while(min <= max){
          long mid = (min + max) / 2;
          if(isValid(batteries, mid, n)){
            min = mid + 1;
          }
          else{
            max = mid - 1;
          }
        }
       return max;
    }
    public boolean isValid(int[] batteries, long mid, long n){
        long sum  = 0;
        for(int i = 0 ; i < batteries.length ; i++){
            if(batteries[i] <= mid){
                sum += batteries[i];
            }
            else{
                sum += mid;
            }
        }
        return sum >= (mid*n); 
    } 
}
