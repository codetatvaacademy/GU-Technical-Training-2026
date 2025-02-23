import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class KidsCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxC=0;
        for(int candy: candies){
            maxC= Math.max(maxC, candy);
        }
        List<Boolean> ans= new ArrayList<>();
        for(int candy:candies){
            ans.add(candy + extraCandies>= maxC );
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of kids: ");
        int n = scanner.nextInt();
        int[] candies = new int[n];
        System.out.println("Enter the number of candies each kid has:");
        for (int i = 0; i < n; i++) {
            candies[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of extra candies: ");
        int extraCandies = scanner.nextInt();

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println("Result c:");
        for (Boolean res : result) {
            System.out.print(res + " ");
        }
    }
}
