public class MinNumBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        long val=(long)m*k;
        int n=bloomDay.length;
        if(val>n){
            return -1;
        }
        int min= 0;
        int max= 0;
        for(int i=0;i<n;i++){
            min= Math.min(min, bloomDay[i]);
            max= Math.max(max, bloomDay[i]);
        }
        while(min<=max){
            int mid=(min+max)/2;
            if(possible(bloomDay, mid,m,k)){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return min;
    }
    public static boolean possible(int [] bloomDay, int mid , int m, int k){
        int n=bloomDay.length;
        int cnt=0;
        int noOfB=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=mid){
                cnt++;
            }else{
                noOfB+=(cnt/k);
                cnt=0;
            }
        }
        noOfB+=(cnt/k);
        return noOfB>=m;
    }
}
