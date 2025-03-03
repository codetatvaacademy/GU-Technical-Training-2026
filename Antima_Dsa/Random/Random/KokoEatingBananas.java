import java.util.*;
public class KokoEatingBananas {
    private static boolean canEatAll(int[] piles, int hours, int mid) {//TC-O(N)
        int hoursSpent = 0;
        for (int pile : piles) {
            hoursSpent += (pile + mid - 1) / mid; 
        }
        return hoursSpent <= hours;
    }
    public static int minEatingSpeed(int[] piles, int hours) { //TC-O(log N)
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, hours, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of piles array ");
        int n = sc.nextInt();
        int[] piles = new int[n];
        System.out.println("Enter the number of bananas in each pile ");
        for(int i=0;i<n;i++){
            piles[i]=sc.nextInt();
        }
        System.out.println("Enter the hours ");
        int hours = sc.nextInt();
        
        System.out.println("Minimum hours taken to finish the banana: " + minEatingSpeed(piles, hours));   //TC-O(Log n)
    }  
}
