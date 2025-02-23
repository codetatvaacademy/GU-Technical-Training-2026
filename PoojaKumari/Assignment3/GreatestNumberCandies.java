import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestNumberCandies {
    public  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int sum=0;
        int max=0;
        List<Boolean> result=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);

        }
        for(int i=0;i<candies.length;i++){
            sum=candies[i]+extraCandies;
            result.add(sum>=max);
       }
    return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of Array:");
        int n=sc.nextInt();
        int[] candies=new int[n];
        System.out.print("Enter the element of Array:");
        for(int i=0;i<candies.length;i++){
            candies[i]=sc.nextInt();
        }
        System.out.print("Enter Extra candies:");
        int extracandies=sc.nextInt();
        List<Boolean> result=new ArrayList();
        result=kidsWithCandies(candies,extracandies);
         System.out.print(result);
        
        sc.close();
    }
}
