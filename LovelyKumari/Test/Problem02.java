import java.util.Scanner;

public class Problem02 { //SPACE COMPLEXITY=O(1) , TIME COMPLEXITY=O(nlog(n)) where n = maximum piles.
    public static int minSpeedOfEating(int[] piles, int h){
        int left=1;
        int right=piles.length-1 ;
        int ans=right ;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, h, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans ;
    }
    private static boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; 
        }
        return hours <= h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] piles = new int[n];

        System.out.println("piles= " );
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }
    
        System.out.print("h=");
        int h = sc.nextInt();
        System.out.println(minSpeedOfEating(piles, h));
      
    }
}
