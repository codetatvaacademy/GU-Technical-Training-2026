import java.util.Arrays;
import java.util.Scanner;

public class MaximumNumberOfCoins {

    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i=0;
        int j = piles.length-1;
        int maxSum =0;
        int sum=0;
        while(i<j){
          sum += piles[j-1];
          i++;
          j-=2;
        }
        maxSum = Math.max(maxSum,sum);
        return sum;
    } 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int piles[] = new int[n];
    for(int i=0;i<piles.length;i++){
        piles[i] = sc.nextInt();
    }
    MaximumNumberOfCoins mn = new MaximumNumberOfCoins();
    System.out.println(mn.maxCoins(piles));
   }
}
