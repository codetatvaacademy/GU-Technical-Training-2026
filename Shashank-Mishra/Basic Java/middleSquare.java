import java.util.*;
public class middleSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Three digit number ");
        int n = sc.nextInt();
        n=n/10;
        int r= n%10;
        int s =r*r;
        System.out.println("Square of the middle digit is "+ s);

        
    }
    
}
