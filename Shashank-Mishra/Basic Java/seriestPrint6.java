import java.util.*;
public class seriestPrint6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(Math.pow(2,i)-1);
        }
    }
    
}
