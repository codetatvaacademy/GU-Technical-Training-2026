import java.util.Arrays;
import java.util.Scanner;

public class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum =0;
        int count =0;
        for(int i=0;i<costs.length;i++){
            if(sum+costs[i]>coins){
               break;
            }
            sum += costs[i];
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int costs[] = new int[n];
    for(int i=0;i<costs.length;i++){
        costs[i] = sc.nextInt();
    }
    int coins = sc.nextInt();
    MaximumIceCreamBars mi = new MaximumIceCreamBars();
    System.out.println(mi.maxIceCream(costs, coins));
   }
}
