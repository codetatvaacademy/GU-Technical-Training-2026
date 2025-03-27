// WAP to take input a number (range 1 to 7) from the user and print the corresponding week. 2. using switch

import java.util.Scanner;

public class weekDayFinderUsingSwitch {
    public static String getWeekday(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid input! Please enter a number between 1 and 7.";
        }
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