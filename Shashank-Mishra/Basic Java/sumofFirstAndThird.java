import java.util.*;
public class sumofFirstAndThird {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a three digit number");
        int Number = sc.nextInt();

        System.out.println("The sum of digit and first and last place is "+ (Number%10 + Number/100) );

    }
    
}
