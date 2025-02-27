import java.util.Scanner;

public class P19_Amount {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in) ;
        System.out.print("Enter Amount :: ");
        int amount = sc.nextInt();

        if ( amount <= 10000 ) {
            System.out.println("No Tax ");
            System.out.println("Amount : " + amount);
        }
        else if (amount <= 25000) {
            int taxAmount = amount - 10000 ;
            int tax = (taxAmount * 10 ) / 100 ;
            System.out.println("Tax Cut : " + tax);
            System.out.println("Amount : " + (amount - tax));
        }
        else if (amount <= 50000 ) {
            int taxAmount = amount - 25000 ;
            int tax = 2500 + (20 * taxAmount) / 100 ;
            System.out.println("Tax Cut : " + tax);
            System.out.println("Amount : " + (amount - tax));
        }
        else {
            int taxAmount = amount - 50000 ;
            int tax = 5000 + (30 * taxAmount) / 100 ;
            System.out.println("Tax Cut : " + tax);
            System.out.println("Amount : " + (amount - tax));
        }

    }
}
