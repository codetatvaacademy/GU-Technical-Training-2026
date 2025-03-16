import java.util.Scanner;

class ShipPackages{
        public static boolean isPossible(int[] weights,int capacity, int days){
         --days;
         int weight =0;
         for(int i=0;i<weights.length;i++){
             if(weights[i]> capacity){
                 return false;
             }
             else if(weight + weights[i]>capacity){
                 --days;
                 weight=0;
             }
             weight += weights[i];
         }
         return days >=0;
        }
         public int shipWithinDays(int[] weights, int days) {
          int minweight =1;
          int maxweight =0;
          for(int weight : weights){
             maxweight += weight;
          }
          while(minweight <= maxweight){
             int mid =( minweight + maxweight)/2;
             if(isPossible(weights,mid,days)){
                maxweight = mid-1;
             }else{
                 minweight = mid+1;
             }
          }
          return minweight;
         }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        int days = sc.nextInt();
       ShipPackages sp = new ShipPackages();
        int result = sp.shipWithinDays(weights, days);
        System.out.println("Minimum ship capacity needed: " + result);
    }
}