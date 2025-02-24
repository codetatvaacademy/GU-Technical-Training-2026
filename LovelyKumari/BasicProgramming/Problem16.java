import java.util.Scanner;

public class Problem16 {
    // WAP to take input a number (range 1 to 7) from the user and print the corresponding week. { using if-else statements and Switch statements}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int day = scanner.nextInt();

/* 
        // Check the day using if-else
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
 */        
        // Check the day using switch-case
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
              break; 
        }
    }
}
