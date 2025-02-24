import java.util.Scanner;

public class arthimetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice");
        System.out.println("1 For Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for Division");
        int choice = sc.nextInt();
        System.out.println("Enter Your First Number");
        int a = sc.nextInt();
        System.out.println("Enter your Second Number");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(a+b);
                break;
                case 2:
                System.out.println(a-b);
                break;
                case 3:
                System.out.println(a*b);
                break;
                case 4:
                System.out.println(a/b);
                break;
        
            default:
            System.out.println("You Have Enterd a wrong value ");
                break;
        }
    }
}
