import java.util.Scanner;

public class MinimumTimeToRepairCar {
        public boolean isValid(int ranks[],long mid,int cars){
          for(int r : ranks){
            cars-=(long) Math.sqrt(mid/r);
            if(cars<=0)
            return true;
          }
          return false;
        }
        public long repairCars(int[] ranks, int cars) {
         long min =1;
         long max =(long)ranks[0]*(long)cars*(long)cars;
         while(min<=max){
            long mid = (min+max)/2;
            if(isValid(ranks,mid,cars)){
                max = mid-1;
            }
            else{
                min = mid+1;
            }
         }
         return min;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ranks = new int[n];
        
        for (int i = 0; i < n; i++) {
            ranks[i] = sc.nextInt();
        }

        int cars = sc.nextInt();

        MinimumTimeToRepairCar rc = new MinimumTimeToRepairCar();
        long result = rc.repairCars(ranks, cars);

       
        System.out.println(result);
        }
}
