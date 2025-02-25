class sqrt {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            long target=(long)mid*mid;
            if(target==x){
                return mid;
            }
            else if(target<x){
                ans=mid;
                start=mid+1;  
            }
            else{
                end=mid-1;
            }

        }
        return ans;
    }
}
