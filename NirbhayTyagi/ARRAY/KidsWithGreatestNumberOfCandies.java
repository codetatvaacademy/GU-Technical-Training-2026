package ARRAY;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxCandies = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }    
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of extracandies");
        int extraCandies = sc.nextInt();
        System.out.println("Enter the no of element in array");
        int n = sc.nextInt();
        int[] candies = new int[n];
        System.out.println("Enter the element of array");
        for(int i = 0; i<n; i++){
            candies[i] = sc.nextInt();
        }
        System.out.println("The result array is : " + kidsWithCandies(candies, extraCandies));
        

    }
}