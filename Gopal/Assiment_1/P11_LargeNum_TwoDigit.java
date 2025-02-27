import java.util.Scanner;

public class P11_LargeNum_TwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

        if ( num1 > num2 ) {
            System.out.println("Num1 is Grater than Num2 ");
            return;
        }
        if ( num1 < num2) {
            System.out.println("Num2 is Greater than Num1 ");
            return;
        }
        System.out.println("Both are equal");

    }
}
