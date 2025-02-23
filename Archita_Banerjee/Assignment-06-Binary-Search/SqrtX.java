public class SqrtX {
    public int mySqrt(int x) {
        long min=1;
        long max=x;
        long ans=0;
        while(min<=max){
            long mid= (min+max)/2;
            long sq= mid*mid;
            if(sq<=x){
                ans=mid;
                min= mid+1;
            }else{
                max=mid-1;
            }
        }
        return (int)ans;
    }
}
