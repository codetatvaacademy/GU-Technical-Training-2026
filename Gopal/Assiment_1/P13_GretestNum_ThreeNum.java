import java.util.Scanner;

public class P13_GretestNum_ThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter num3 : ");
        int num3 = sc.nextInt();

        // Check Condition for greater number by Nested loop
//        if ( num1 > num2 ) {
//            if (num1 > num3) {
//                System.out.println("Num1 is Greater");
//                return;
//            }
//            System.out.println("Num3 is Greater");
//            return;
//        }
//        if ( num2 > num1) {
//            if( num2 > num3 ) {
//                System.out.println("Num2 is Greater");
//                return;
//            }
//            System.out.println("Num3 is Greater");
//            System.out.println();
//        }
//        System.out.println("Num3 is Greater");

        // Check Condition for greater number by  And Operator
        if ( num1 > num2 && num1 > num3) {
            System.out.println("Num1 is Greater");
            return;
        }
        if ( num2 > num1 && num2 > num3 ) {
            System.out.println("Num2 is Greater");
            return;
        }
        System.out.println("Num3 is Greater");

    }
}
