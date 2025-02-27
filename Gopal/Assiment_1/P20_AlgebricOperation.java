import java.util.Scanner;

public class P20_AlgebricOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter num1 : ");
        int num = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

        System.out.println("1 -> add");
        System.out.println("2 -> Subtraction");
        System.out.println("3 -> Multiplication");
        System.out.println("4 -> Divide");
        System.out.print("Select number for operation3 : ");
        int op = sc.nextInt();

        if ( op == 1 ) {
            System.out.println("Sum :: " + (num + num2));
        }
        else if ( op == 2 ) {
            System.out.println("Subtraction :: " + (num - num2));
        }
        else if ( op == 3 ) {
            System.out.println("Product :: " + (num * num2));
        }
        else {
            if ( num2 == 0 ) {
                System.out.println("Canot divide by 0 ");
                return;
            }
            System.out.println("Divide :: " + (num/num2));
        }

    }
}
