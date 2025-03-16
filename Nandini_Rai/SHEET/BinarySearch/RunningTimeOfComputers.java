import java.util.Scanner;

public class RunningTimeOfComputers {
        public boolean isValid(int batteries[],long mid,int n){
            long sum =0;
            for(int i=0;i<batteries.length;i++){
               sum += Math.min(mid,batteries[i]);
            }
              if(sum<mid*n){
                return false;
            }
            return true;
        }
        public long maxRunTime(int n, int[] batteries) {
            long min=batteries[0];
            long max=0;
            for(int i=0;i<batteries.length;i++){
                min = Math.min(min,batteries[i]);
                max+=batteries[i];
            }
         while(min<=max){
            long mid = (min+max)/2;
            if(isValid(batteries,mid,n))
                min = mid+1;
            else
                max = mid-1;
        }
        return max;
        }
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] batteries = new int[m];

        for (int i = 0; i < m; i++) {
            batteries[i] = sc.nextInt();
        }

       RunningTimeOfComputers rt = new RunningTimeOfComputers();
        long result = rt.maxRunTime(n, batteries);
        System.out.println(result);
    }
}
