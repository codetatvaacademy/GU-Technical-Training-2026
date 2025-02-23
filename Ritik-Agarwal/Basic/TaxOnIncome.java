import java.util.Scanner;
public class TaxOnIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income: ");
        int income = sc.nextInt();
        sc.close();
        int discount = 0;
        if(income<=10000){
            System.out.println("No tax applicable.");
        }
        else if(income>10000 && income<=25000){
            discount = (income/100)*10;
            System.out.println("Tax on " + income + " is: " + discount);
        }
        else if(income>25000 && income<=50000){
            discount = (income/100)*20;
            System.out.println("Tax on " + income + " is: " + (2500+discount));
        }
        else if(income>50000){
            discount = (income/100)*30;
            System.out.println("Tax on " + income + " is: " + (5000+discount));
        }
    }
}