import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two num");
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
       System.out.println("enter operator(+,-,*,/,%)");
        char ra = sc.next().charAt(0);
        switch (ra){
            case '+':System.out.println(a1+a2);
            break;
            case '-':System.out.println(a1-a2);
            break;
            case '*':System.out.println(a1*a2);
            break;
            case '/':System.out.println(a1/a2);
            break;
            case '%':System.out.println(a1%a2);
            break;
            default: System.out.println("Invalid");
        }
    }
}

