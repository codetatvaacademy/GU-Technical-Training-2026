class Solution {
    public int mySqrt( int x) {
    if(x <= 1){
        return x;
    }
     int min = 1;
     int max = x/2;
     while(min <= max){
        int mid = (min + max) / 2;
        if(mid <= x / mid){
            min = mid + 1;
        }
        else{
            max = mid - 1;
        }
    }
    return max;
}
}
