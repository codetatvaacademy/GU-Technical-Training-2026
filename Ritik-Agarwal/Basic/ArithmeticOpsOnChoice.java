import java.util.Scanner;
public class ArithmeticOpsOnChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first operand: ");
        int a  = sc.nextInt();
        System.out.println("Enter second operand: ");
        int b  = sc.nextInt();
        System.out.println("Enter the operator: ");
        char ch = sc.next().charAt(0);
        sc.close();
        switch (ch) {
            case '+':
                System.out.println(a + " + " + b + " is: " + (a+b));
                break;
            case '-':
                System.out.println(a + " - " + b + " is: " + (a-b));
                break;
            case '*':
                System.out.println(a + " * " + b + " is: " + (a*b));
                break;
            case '/':
                if(b==0){
                    System.out.println("Second operand can not be zero");
                }
                else{
                    System.out.println(a + " / " + b + " is: " + (a/b));
                }
                break;
            case '%':
                if(b==0){
                    System.out.println("Second operand can not be zero");
                }
                else{
                    System.out.println(a + " % " + b + " is: " + (a%b));
                }
                break;
        
            default:
                System.out.println("Enter a valid arithmetic operator.");
                break;
        }
    }
}