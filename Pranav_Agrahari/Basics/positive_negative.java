import java.util.Scanner;

public class positive_negative {

    public static int check (int a ){
        if (a == 0) {
            System.out.println("The given number is Zero");

        }
        else if (a > 0) {
            System.out.println("The given number is positive");
        }
        else{
            System.out.println("The given number is negative ");
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        System.out.println(check(a));

    }
}
