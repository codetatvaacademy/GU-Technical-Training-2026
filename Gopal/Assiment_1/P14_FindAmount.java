import java.util.Scanner;

public class P14_FindAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter rate : ");
        int rate = sc.nextInt();
        System.out.print("Enter Amount : ");
        int amount = sc.nextInt();

        // Calcualte total amount
        int total = rate * amount ;

        // Check condtion for profit
        if ( total < 2000 ) {
            System.out.println("Total amount :: " + total);
            return;
        }
        double profit = ( 15*total ) / 100.0 ;
        System.out.println("You Save :: " + profit);
        System.out.println("Total Amount :: " + (total - profit));
    }
}
