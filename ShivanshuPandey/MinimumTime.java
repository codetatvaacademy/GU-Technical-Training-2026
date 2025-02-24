import java.util.*;
public class MinimumTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rank array ");
        int n = sc.nextInt();
        int[] ranks = new int[n];
        System.out.println("Enter the ranks of mechanics ");
        for(int i=0;i<n;i++){
            ranks[i]=sc.nextInt();
        }
        Arrays.sort(ranks);//TC-O(Nlogn)
        System.out.println("Enter the cars ");
        int cars = sc.nextInt();

        System.out.println("Minimum time taken to finish the repairing: " + minimumTime(ranks, cars));
    }

    private static int minimumTime(int[]ranks,int cars){
        int miniTime = 0;
        int maxTime = Integer.MIN_VALUE;
        int diff = 1;
        int num = 1;
        maxTime = Math.max(maxTime,ranks[0] * cars - ranks.length +1);
        for(int i=1;i<ranks.length;i++){//TC-O(N)
            maxTime = Math.max(maxTime,ranks[i] * num);
            num++;
            miniTime = Math.min(miniTime,MaxTime);

        }
        return miniTime;
    }
}
