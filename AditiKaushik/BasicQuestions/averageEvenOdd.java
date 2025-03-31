// 	WAP to calculate the average of even and odd numbers given by user until user press -1.

import java.util.Scanner;

public class averageEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers (press -1 to stop):");
        calculateAverage(scanner);
        
        scanner.close();
    }
    
    public static void calculateAverage(Scanner scanner) {
        int evenSum = 0, evenCount = 0;
        int oddSum = 0, oddCount = 0;
        
        while (true) {
            int num = scanner.nextInt();
            
            if (num == -1) {
                break;
            }
            
            if (num % 2 == 0) {
                evenSum += num;
                evenCount++;
            } else {
                oddSum += num;
                oddCount++;
            }
        }
        
        printAverage(evenSum, evenCount, "even");
        printAverage(oddSum, oddCount, "odd");
    }
    
    public static void printAverage(int sum, int count, String type) {
        if (count > 0) {
            System.out.println("Average of " + type + " numbers: " + (double) sum / count);
        } else {
            System.out.println("No " + type + " numbers entered.");
        }
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)