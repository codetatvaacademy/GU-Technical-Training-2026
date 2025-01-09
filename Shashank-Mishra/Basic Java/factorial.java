import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number you want to calculate is factorial");
        int n=sc.nextInt();
        int fact =1;
        if(n==0)
        {
            fact=0;
        }
        for(int i =1;i<=n;i++)
        {
            fact = fact *i;
        }
        System.out.println("Factorial of the given number is "+ fact);
    }
    
}
