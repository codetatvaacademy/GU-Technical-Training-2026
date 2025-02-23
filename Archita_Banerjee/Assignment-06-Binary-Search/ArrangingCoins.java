public class ArrangingCoins {
    public int arrangeCoins(int n) {
        long low=0;
        long high=n;
        while(low<=high){
            long mid= (low+high)/2;
            long totalcoins=mid*(mid+1)/2;
            if(totalcoins<=n){
                low= mid+1;
            }else{
                high=mid-1;
            }
        }
        return (int)high;
    }
}
