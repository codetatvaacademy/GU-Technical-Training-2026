import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number you want to reverse");
        int n=sc.nextInt();
        int s=0;
        int d=n;
        while(n!=0)
        {
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==d)
        {
            System.out.println("it is a palindrome number");
        }
        else
        {
            System.out.println("it is not a palindrome  number");
        }
    }   
}

