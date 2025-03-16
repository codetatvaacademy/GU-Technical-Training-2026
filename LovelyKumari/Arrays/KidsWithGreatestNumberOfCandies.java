package Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        /* List<Boolean> ans = new ArrayList<>();
        for(int i=0; i<candies.length;i++){
            boolean test=false;
            for(int j=0; j<candies.length;j++){
                if(candies[i]+extraCandies<candies[j]){
                    test=true ;
                    break;
                }
            }
            if(test){
                ans.add(false);
            } else{
                ans.add(true);
            }
        }
        return ans;
        */

        List<Boolean> ans= new ArrayList<>(candies.length);
        int maximum=Integer.MIN_VALUE;
        for(int i=0; i<candies.length ; i++){
            maximum=Math.max(maximum , candies[i]);
        }
        for(int i: candies){
            ans.add(i>= maximum-extraCandies);
        } 
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of kids: ");
        int n=sc.nextInt();
        int[] candies=new int[n];

        System.out.println("Enter the number of candies each kid has: ");
        for(int i=0; i<n; i++){
            candies[i]=sc.nextInt();
        }
        System.out.println("Enter the number of extra candies: ");
        int extraCandies=sc.nextInt();
        KidsWithGreatestNumberOfCandies obj= new KidsWithGreatestNumberOfCandies();
        List<Boolean> answer= obj.kidsWithCandies(candies, extraCandies);

        System.out.println("Output: " + answer);
    }  
}
