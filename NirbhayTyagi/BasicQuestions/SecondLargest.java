//WAP to take input 3 numbers and print the 2nd largest number among them.//
import java.util.Scanner;
public class SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int largest = Math.max(num1 , Math.max(num2, num3));
        int secondLargest;
        if(largest == num1){
            secondLargest = Math.max(num2, num3);
        }else if(largest == num2){
            secondLargest = Math.max(num1, num3);
        }else{
            secondLargest = Math.max(num1, num2);
        }
        System.out.println("The second largest no is :" + secondLargest);
    }  
}