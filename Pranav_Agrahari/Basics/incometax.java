import java.util.Scanner;

public class incometax {
    public static double tax_calculation(int income){
        double tax = 0;
        double diff = 0;
        if (income <= 10000) {
            tax =0;

        }
        else if (income > 10000 && income<= 25000) {
            diff = income-10000;
            tax = (10*diff)/100;
        }
        else if (income > 25000 && income <= 50000) {
            diff = income-25000;
            tax = 2500+((20*diff)/100);
        }
        else {
            diff = income-50000;
            tax = 5000+((30*diff)/100);
        }
        return tax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        System.out.println(tax_calculation(income));
    }
}
