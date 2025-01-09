import java.util.*;
public class positiveNegativeZero {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number to be checked ");
        int n = sc.nextInt();

        if(n>0)
        {
            System.out.println("Positive number");
        }
        else if (n<0)
        {
            System.out.println("Negative number");
        }
        else
        System.out.println("zero");

    }
    
}
