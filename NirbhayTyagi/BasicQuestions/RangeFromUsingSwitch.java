//WAP to take input a number (range 1 to 7) from the user and print the corresponding week using switch.//
import java.util.Scanner;
public class RangeFromUsingSwitch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7:");
        int day = sc.nextInt();
        switch(day) {
            case 1:
               System.out.println("Sunday");
               break;
            case 2:
               System.out.println("Monday");
               break;
            case 3:
               System.out.println("Tuesday");
               break;
            case 4:
               System.out.println("Wednesday");
               break;
            case 5:
               System.out.println("Thrusday");
               break;
            case 6:
               System.out.println("Friday");
               break;
            case 7:  
               System.out.println("Saturday");
               break; 
            default:
               System.out.println("Invalid input! Please enter a number between 1 and 7.");
               break;   
        }
    }
}