public class MinTimeRepairCars {
    public static boolean isPossible(int[]arr, long mid, int n){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum += Math.floor(Math.sqrt(mid/arr[i]));
        }
        return sum>=n;
    }
    public long repairCars(int[] ranks, int cars) {
        if (cars == 0) {
            return 0;
        }
        long min=1;
        long max = (long) ranks[0] * (long) cars * cars;
        for(int i=1;i<ranks.length;i++){
            max=Math.max(max,  (long) ranks[i] * cars * cars);
        }

        while(min<=max){
            long mid= (min+max)/2;
            if(isPossible(ranks, mid, cars)){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return min;
    }
}
