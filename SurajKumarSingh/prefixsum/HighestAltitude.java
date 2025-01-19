//Leetcode --> 1732

package prefixsum;

import java.util.Scanner;

public class HighestAltitude {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        for(int i = 1; i< n; i++){
          nums[i] += nums[i-1];
        } 
        return nums; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the number of elements in the gain array: ");
        int size = scanner.nextInt();


        int[] gain = new int[size];

    
        System.out.println("Enter the elements of the gain array:");
        for (int i = 0; i < size; i++) {
            gain[i] = scanner.nextInt();
        }

    
        HighestAltitude highestAltitude = new HighestAltitude();
        int[] altitudes = highestAltitude.runningSum(gain);

    
        int highest = 0; 
        for (int altitude : altitudes) {
            if (altitude > highest) {
                highest = altitude;
            }
        }

        System.out.println("The highest altitude is: " + highest);  
    }
}
