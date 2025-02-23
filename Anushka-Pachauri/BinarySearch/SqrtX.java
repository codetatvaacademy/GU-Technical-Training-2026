class SqrtX{
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int min=1;
        int max=x;
        int answer=0;
        while(min<=max){
            int mid=(max+min)/2;
            if(mid*mid==x){
                return mid;
            }
            else if((long)mid*mid>(long)x){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return Math.round(max);
    }
}