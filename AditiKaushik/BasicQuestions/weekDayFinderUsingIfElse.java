// WAP to take input a number (range 1 to 7) from the user and print the corresponding week. 1. using if else

import java.util.Scanner;

public class weekDayFinderUsingIfElse {
    public static String getWeekday(int day) {
        if (day == 1) return "Monday";
        else if (day == 2) return "Tuesday";
        else if (day == 3) return "Wednesday";
        else if (day == 4) return "Thursday";
        else if (day == 5) return "Friday";
        else if (day == 6) return "Saturday";
        else if (day == 7) return "Sunday";
        else return "Invalid input! Please enter a number between 1 and 7.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (1-7) to get the corresponding weekday: ");
        int day = scanner.nextInt();

        System.out.println(getWeekday(day));

        scanner.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)