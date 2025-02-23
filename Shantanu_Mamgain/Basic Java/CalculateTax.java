import java.util.Scanner;

public class CalculateTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the income amount: ");
        int income = sc.nextInt();
        double tax;

        if(income<=10000){
            tax=0;
        }
        else if(income>10000 && income<=25000){
            tax=(0.1*(income-10000));
        }
        else if(income>25000 && income<=50000){
            tax= (2500+(0.2*(income-25000)));
        }
        else{
            tax = (5000+(0.3*(income-50000)));
        }

        System.out.println("Total tax to be paid (according to nirmala sitaraman): "+tax);


        sc.close();
    }
}
