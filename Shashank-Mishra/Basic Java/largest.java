import java.util.*;
public class largest {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the second number");
        int n2=sc.nextInt();

        if(n1>n2)
        System.out.println("Largest is "+n1);
        else 
        System.out.println("Laegest is "+n2);
    }
    
}
