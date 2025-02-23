import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Year");
        int a = sc.nextInt();
        if (a%4 == 0) {
            System.out.println("The given year is leap year ");
        }
        else{
            System.out.println("The given year is not leap year");
        }
    }
    
}
