public class KokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int i=0;i<piles.length;i++){
            max= Math.max(max, piles[i]);
        }
        while(min<=max){
            int mid= (min+max)/2;
            if(isPossible(piles, mid, h)){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return min;
    }
    public static boolean isPossible(int []arr, int mid, int h){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+= Math.ceil((double)arr[i]/mid);
        }
        return sum<=h;
    }
}
