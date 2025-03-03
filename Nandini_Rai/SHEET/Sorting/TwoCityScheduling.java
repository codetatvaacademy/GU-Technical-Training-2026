
import java.util.Arrays;
import java.util.Scanner;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
    Arrays.sort(costs,(a,b) -> (a[0]-a[1])-(b[0]-b[1]));
    int n = costs.length/2;
     int minCost = 0;
      for(int i =0;i<costs.length;i++){
         if(i<n){
          minCost += costs[i][0];
         }else{
            minCost +=costs[i][1];
         }
      }
      return minCost;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int costs[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;i<n;j++){
                costs[i][j] = sc.nextInt();
            }
        }
       TwoCityScheduling tc = new TwoCityScheduling();
       System.out.println(tc.twoCitySchedCost(costs));
    }
}
