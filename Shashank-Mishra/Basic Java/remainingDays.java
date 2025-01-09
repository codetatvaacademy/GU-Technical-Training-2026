import java.util.*;
public class remainingDays {
    
    public static void main(String[] args)
     {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter the number of days ");
        int NumberOfDaya =sc.nextInt();

        int years = NumberOfDaya/365;
        int months = (NumberOfDaya%365)/12;
        int days = (NumberOfDaya%365)%12;
        System.out.println("There are "+years+" years "+months+" months "+days+" days remaining");



    }
}
