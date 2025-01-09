//Question 30
import java.util.*;
public class printFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.print(fact);

        sc.close();
    }
    
}
